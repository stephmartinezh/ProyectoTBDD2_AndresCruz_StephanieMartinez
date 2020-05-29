/*
Clase para la conexion de la Base de datos document DB
 */
package ProyectoTBDD2_AndresCruz_StephanieMartinez;

import com.mongodb.BasicDBObject;
import com.mongodb.ConnectionString;
import com.mongodb.MongoException;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

/**
 *
 * @author Faith
 */
public class DriverDB {

    private final String databaseName = "AgenciaEmpleo";
    private ConnectionString connectionString;
    private CodecRegistry pojoCodecRegistry;
    private CodecRegistry codecRegistry;
    private MongoClientSettings clientSettings;

    private MongoClient mongoClient;
    private MongoDatabase database;

    public DriverDB() {
        connectionString = new ConnectionString("mongodb+srv://admin:CjfoOtXvZ2dNw03G@proyectoacsmtbdd21-pruuh.mongodb.net/test?retryWrites=true&w=majority");
        pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());
        codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry);
        clientSettings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .codecRegistry(codecRegistry)
                .build();
    }
    
    private void crearConexion(){
        mongoClient = MongoClients.create(clientSettings);
        database = mongoClient.getDatabase(databaseName);
    }
    
    public List<Persona> getPersonas(Document par){
        List<Persona> personas = null;
        try {
            crearConexion();
            MongoCollection<Persona> collection = database.getCollection("Persona", Persona.class);
            if(par != null){
                personas = collection.find(par).into(new ArrayList<>());
            }else{
                personas = collection.find().into(new ArrayList<>());
            }
        } catch (MongoException e) {
            e.printStackTrace();
        }finally{
            cerrarConexion();
        }
        return personas;
    }
    
    public List<Empresas> getEmpresa(Document par){
        List<Empresas> empresas = null;
        try {
            crearConexion();
            MongoCollection<Empresas> collection = database.getCollection("Empresa", Empresas.class);
            if(par != null){
                empresas = collection.find(par).into(new ArrayList<>());
            }else{
                empresas = collection.find().into(new ArrayList<>());
            }
        } catch (MongoException e) {
            e.printStackTrace();
        }finally{
            cerrarConexion();
        }
        return empresas;
    }
    
    public List<TipoTrabajo> getTipoTrabajo(Document par){
        List<TipoTrabajo> tipoTrabajos = null;
        try {
            crearConexion();
            MongoCollection<TipoTrabajo> collection = database.getCollection("TipoEmpleo", TipoTrabajo.class);
            if(par != null){
                tipoTrabajos = collection.find(par).into(new ArrayList<>());
            }else{
                tipoTrabajos = collection.find().into(new ArrayList<>());
            }
        } catch (MongoException e) {
            e.printStackTrace();
        }finally{
            cerrarConexion();
        }
        return tipoTrabajos;
    }
    
    public void setPersonas(Persona P){
        try {
            crearConexion();
            MongoCollection<Persona> collection = database.getCollection("Persona", Persona.class);
            collection.insertOne(P);
        } catch (MongoException e) {
            e.printStackTrace();
        }finally{
            cerrarConexion();
        }
    }
    
    public void setEmpresas(Empresas P){
        try {
            crearConexion();
            MongoCollection<Empresas> collection = database.getCollection("Empresa", Empresas.class);
            collection.insertOne(P);
        } catch (MongoException e) {
            e.printStackTrace();
        }finally{
            cerrarConexion();
        }
    }
    
    private void cerrarConexion(){
        mongoClient.close();
    }

}
