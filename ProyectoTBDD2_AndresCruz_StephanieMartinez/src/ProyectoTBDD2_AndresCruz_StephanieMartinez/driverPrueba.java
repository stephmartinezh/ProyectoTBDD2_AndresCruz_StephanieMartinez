/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoTBDD2_AndresCruz_StephanieMartinez;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.WriteConcern;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
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
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

/**
 *
 * @author Faith
 */
public class driverPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final String databaseName = "ProyectoTBDD";
        ConnectionString connectionString = new ConnectionString("mongodb+srv://admin:CjfoOtXvZ2dNw03G@proyectoacsmtbdd21-pruuh.mongodb.net/test?retryWrites=true&w=majority");
        CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());
        CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry);
        MongoClientSettings clientSettings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .codecRegistry(codecRegistry)
                //.writeConcern(WriteConcern.ACKNOWLEDGED)
                .build();

        MongoClient mongoClient;
        MongoDatabase database;

        try {
              
            String collectionS = "Persona";
            mongoClient = MongoClients.create(clientSettings);
            database = mongoClient.getDatabase(databaseName);
            //MongoCollection<Document> collection = database.getCollection(collectionS);
            
            //Traer El contenido de Arreglos
//            MongoCursor<String> cursor = collection.distinct("curriculum.expectativaLaboral", new Document("_id", "C4"), String.class).iterator();
//            while (cursor.hasNext()){
//                System.out.println(cursor.next().toString());
//            }
            MongoCollection<Persona> collection = database.getCollection(collectionS, Persona.class);


//            collection.deleteOne(new Document("_id", "C4"));
            Persona p = new Persona();
            p.setId("C4");
            p.setNombre("Rafael Eduardo");
            p.setApellido("Flores Caceres");
            p.setNacionalidad("Honduras");
            p.setGenero("M");
            
            //Convertir de String A date
            DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaN = null;
            try {
                fechaN = sdf.parse("22/08/1998");
            } catch (ParseException ex) {
                Logger.getLogger(DriverDB.class.getName()).log(Level.SEVERE, null, ex);
            }
            p.setDireccion("Esto no existe we :v");
            p.setFechanacimiento(fechaN);
//            p.setFechaNacimiento(fechaN);
            p.setTelefono("1122-6677");
            p.setCorreo("rafael@correo.com");
//            p.setId("1234-1234-12345");
//            p.setIdentidad("1234-1234-12345");
            
////            Direccion
//            Direccion d = new Direccion();
//            d.setPais("Honduras");
//            d.setDepart("Fco.Morazan");
//            d.setMunicipio("Valle de Angeles");
//            d.setColonia("Col. Cerro Grande");
//            p.setDireccion(d);
//            
//            //Dato Familiar
//            List<DatoFamiliar> df = new ArrayList<>();
//            DatoFamiliar df1 = new DatoFamiliar();
//            df1.setId("C1");
//            df1.setParentesco("Madre");
//            df.add(df1);
//            DatoFamiliar df2 = new DatoFamiliar();
//            df2.setId("C2");
//            df2.setParentesco("Hermana");
//            df.add(df2);
//            p.setRefFamiliares(df);
//            
//            //Dato Legal
//            DatoLegal dl = new DatoLegal();
//            dl.setEsMayor(true);
//            dl.setEstuvoPreso(false);
//            dl.setTieneLicencia(true);
//            p.setLegalesD(dl);
//            
//            
//            Curriculum c = new Curriculum();
//            List<String> expLaboral = new ArrayList<>();
//            expLaboral.add("Programador");
//            expLaboral.add("Tester");
//            c.setExpectativaLaboral(expLaboral);
//            c.setSalarioEsperado(20000);
//            c.setTipoContrato("Tiempo Completo");
//            
//            Habilidades h = new Habilidades();
//            List<String> idiomas = new ArrayList<>();
//            idiomas.add("Español");
//            idiomas.add("Ingles");
//            h.setIdiomas(idiomas);
//            List<String> tecnicas = new ArrayList<>();
//            tecnicas.add("Programacion C++");
//            tecnicas.add("Programacion Java");
//            h.setTecnicas(tecnicas);
//            c.setHabilidaes(h);
//            
            
            
//            ExpLaboral el = new ExpLaboral();
//            el.setAniosExp(1);
//            el.setTrabajoAnterior("Jestereo");
//            el.setPuestoAnterior("Agente de Soporte Tecnico");
//            c.setExpLaboral(el);
//            
//            DatoAcademico da = new DatoAcademico();
//            da.setGradoAcademico("Superior");
//            da.setEspacializacion("Programacion Web");
//            da.setEstudianteActivo(true);
//            List<String> estudioOtros = new ArrayList<>();
//            estudioOtros.add("Cursos de Ingles");
//            da.setOtrosEstudios(estudioOtros);
//            c.setDatAcademicos(da);
//            p.setCurriculum(c);
            
            DatosSanitarios ds = new DatosSanitarios(false,true,false,false);
            p.setDatossanitarios(ds);
//            ds.setAlergia(false);
//            ds.setProblemaRespiratorio(true);
//            ds.setProblemaCardiaco(false); // Problema Cardiaco
//            ds.setProblemaMental(false);
//            p.setdSalud(ds);
//            
//            System.out.println(p.getdSalud().toString());
//            
            collection.withWriteConcern(WriteConcern.ACKNOWLEDGED);
            collection.insertOne(p);
            

//            Persona p1 = new Persona();
//            p1.setId("C2");
//            p1.setNombre("Ivonne Denisse");
//            p1.setApellido("Centeno Caceres");
//            p1.setNacionalidad("Hondureña");
//            p1.setGenero("F");
//            DateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
//            Date fechaN1 = null;
//            try {
//                fechaN1 = sdf1.parse("23/09/2009");
//            } catch (ParseException ex) {
//                Logger.getLogger(DriverDB.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            p1.setFechaNacimiento(fechaN);
//            p1.setTelefono("1122-4455");
//            p1.setCorreo("ivonne@correo.com");
//            Direccion d1 = new Direccion();
//            d1.setPais("Honduras");
//            d1.setDepart("Fco.Morazan");
//            d1.setMunicipio("Valle de Angeles");
//            d1.setColonia("Col. Cerro Grande");
//            p1.setDireccion(d);
            
            //collection.insertOne(p);

        } catch (MongoException e) {
            e.printStackTrace();
        }
    }

}
