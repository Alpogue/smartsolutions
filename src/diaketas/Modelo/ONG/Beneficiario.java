/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diaketas.Modelo.ONG;

import com.mysql.jdbc.Statement;
import diaketas.ConexionBD;
import diaketas.Modelo.Gestores.Gestor_de_beneficiarios;
import diaketas.Modelo.ONG.ONG;
import diaketas.Modelo.ONG.Usuarios;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kesada
 */
public class Beneficiario extends Usuarios{
    public String Nacionalidad;
    public String Estado_civil;
    public String Domicilio;
    public int Codigo_Postal;
    public String Observaciones_Datos_Personales;
    public Date Fecha_Inscripcion;
    public String Motivo;
    public String Tipo_Vivienda;
    public Double Precio_Vivienda;
    public String Situacion_Economica;
    public int Expediente;
    public String Observaciones_Familiares;
    public String Observaciones_Vivienda;
    public String Nivel_Estudios;
    public String Profesion;
    public String Experiencia_Laboral;
    public String Ciudad_Nacimiento;
    
   
    /*-----------------------------Constructores-------------------------------*/
    public Beneficiario (String NIF_CIF, String Nombre,
            String Apellidos, Date FechaNac, String Localidad, int Activo,
            Date FechaDesac, String Email, int Telefono, String Nacionalidad,
            String Estado_civil, String Domicilio, int Codigo_Postal,
            Date Fecha_Inscripcion, int Expediente, String Motivo,
            Double Precio_Vivienda, String Tipo_Vivienda, String Observaciones_Datos_Personales,
            String Observaciones_Familiares, String Observaciones_Vivienda,
            String Ciudad_Nacimiento, String Situacion_Economica, String Nivel_Estudios,
            String Profesion, String Experiencia_Laboral){
        
        this.Nacionalidad = Nacionalidad;
        this.Estado_civil = Estado_civil;
        this.Domicilio = Domicilio;
        this.Codigo_Postal = Codigo_Postal;
        this.Fecha_Inscripcion = Fecha_Inscripcion;
        this.Expediente = Expediente;
        this.Motivo = Motivo;
        this.NIF_CIF = NIF_CIF;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.FechaNac = FechaNac;
        this.Localidad = Localidad;
        this.Activo = Activo;
        this.FechaDesac = FechaDesac;
        this.Email = Email;
        this.Telefono = Telefono;
        this.Precio_Vivienda = Precio_Vivienda;
        this.Tipo_Vivienda = Tipo_Vivienda;
        this.Observaciones_Datos_Personales = Observaciones_Datos_Personales;
        this.Observaciones_Familiares = Observaciones_Familiares;
        this.Observaciones_Vivienda = Observaciones_Vivienda;
        this.Ciudad_Nacimiento = Ciudad_Nacimiento;
        this.Situacion_Economica = Situacion_Economica;
        this.Nivel_Estudios = Nivel_Estudios;
        this.Profesion = Profesion;
        this.Experiencia_Laboral = Experiencia_Laboral;
    }
 
    public Beneficiario (Beneficiario datosBeneficiario){    
        this.Nacionalidad = datosBeneficiario.Nacionalidad;
        this.Estado_civil = datosBeneficiario.Estado_civil;
        this.Domicilio = datosBeneficiario.Domicilio;
        this.Codigo_Postal = datosBeneficiario.Codigo_Postal;
        this.Fecha_Inscripcion = datosBeneficiario.Fecha_Inscripcion;
        this.Expediente = datosBeneficiario.Expediente;
        this.Motivo = datosBeneficiario.Motivo;
        this.NIF_CIF = datosBeneficiario.NIF_CIF;
        this.Nombre = datosBeneficiario.Nombre;
        this.Apellidos = datosBeneficiario.Apellidos;
        this.FechaNac = datosBeneficiario.FechaNac;
        this.Localidad = datosBeneficiario.Localidad;
        this.Activo = datosBeneficiario.Activo;
        this.FechaDesac = datosBeneficiario.FechaDesac;
        this.Email = datosBeneficiario.Email;
        this.Telefono = datosBeneficiario.Telefono;
        this.Precio_Vivienda = datosBeneficiario.Precio_Vivienda;
        this.Tipo_Vivienda = datosBeneficiario.Tipo_Vivienda;
        this.Observaciones_Datos_Personales = datosBeneficiario.Observaciones_Datos_Personales;
        this.Observaciones_Familiares = datosBeneficiario.Observaciones_Familiares;
        this.Observaciones_Vivienda = datosBeneficiario.Observaciones_Vivienda;
        this.Ciudad_Nacimiento = datosBeneficiario.Ciudad_Nacimiento;
        this.Situacion_Economica = datosBeneficiario.Situacion_Economica;
        this.Nivel_Estudios = datosBeneficiario.Nivel_Estudios;
        this.Profesion = datosBeneficiario.Profesion;
        this.Experiencia_Laboral = datosBeneficiario.Experiencia_Laboral;
     }
    
    /*---------------------------Beneficiario----------------------------------*/
    public void desactivarUsuario(Date fecha_desactivacion){
        ConexionBD con = new ConexionBD();
    
        /*Modificamos los datos del objeto*/
        Activo = 0;
        FechaDesac = fecha_desactivacion;
        
        /*Convertimos Date para trabajar*/
        java.sql.Timestamp fecha_Desac = new java.sql.Timestamp(FechaDesac.getTime());

        con.conectarBD();
        try {
            Statement instruccion = (Statement) con.conexion().createStatement();
            
            /* Desactivamos el usuario y actualizamos fecha de Baja*/
            instruccion.executeUpdate("UPDATE Usuario SET Activo = " + Activo + ", Fecha_Desactivacion = \""
                    +fecha_Desac+"\" WHERE NIF_CIF = \"" + NIF_CIF + "\"");
         }
         /*Captura de errores*/
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e);}
         /*Desconexión de la BD*/
         finally {
            if (con.hayConexionBD()) {
                try {
                    con.desconectarBD();
                } catch (SQLException ex) {
                    Logger.getLogger(ONG.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }         
    }
    
    public void cambiarDatosBeneficiario (Beneficiario datosBeneficiario){
    
        ConexionBD con = new ConexionBD();
        
        /* Actualizamos los datos */
        con.conectarBD();

        java.sql.Timestamp fecha_Nacimiento = new java.sql.Timestamp(datosBeneficiario.FechaNac.getTime());
        
        try {
            Statement instruccion = (Statement) con.conexion().createStatement();

            instruccion.executeUpdate("Update Usuario SET "
                    + "NIF_CIF = \"" + datosBeneficiario.NIF_CIF + "\", "
                    + "Nombre = \"" + datosBeneficiario.Nombre + "\", "                    
                    + "Apellidos = \"" + datosBeneficiario.Apellidos + "\", "                    
                    + "Fecha_Nacimiento_Fundacion = \"" + fecha_Nacimiento + "\", "                    
                    + "Localidad = \"" + datosBeneficiario.Localidad + "\", "
                    + "Email = \"" + datosBeneficiario.Email + "\", "
                    + "Telefono = \"" + datosBeneficiario.Telefono + "\""
                    + " WHERE NIF_CIF = \""+diaketas.diaketas.gestorBeneficiarios.NIF_Beneficiario+"\"");
         
            instruccion.executeUpdate("Update Beneficiario SET "
                    + "NIF_CIF = \"" + datosBeneficiario.NIF_CIF + "\", "
                    + "Nacionalidad = \"" + datosBeneficiario.Nacionalidad + "\", "                    
                    + "Estado_Civil = \"" + datosBeneficiario.Estado_civil + "\", "                    
                    + "Domicilio = \"" + datosBeneficiario.Domicilio + "\", "                    
                    + "Codigo_Postal = " + datosBeneficiario.Codigo_Postal + ", "
                    + "Expediente = " + datosBeneficiario.Expediente + ", "
                    + "Motivo = \"" + datosBeneficiario.Motivo + "\", "                  
                    + "Precio_Vivienda = " + datosBeneficiario.Precio_Vivienda + ", "
                    + "Tipo_Vivienda = \"" + datosBeneficiario.Tipo_Vivienda + "\", "
                    + "Observaciones_Datos_Personales = \"" + datosBeneficiario.Observaciones_Datos_Personales + "\", "
                    + "Observaciones_Familiares = \"" + datosBeneficiario.Observaciones_Familiares + "\", "
                    + "Observaciones_Vivienda = \"" + datosBeneficiario.Observaciones_Vivienda + "\", "
                    + "Ciudad_Nacimiento = \"" + datosBeneficiario.Ciudad_Nacimiento + "\", "
                    + "Situacion_Economica = \"" + datosBeneficiario.Situacion_Economica + "\", "
                    + "Nivel_Estudios = \"" + datosBeneficiario.Nivel_Estudios + "\", "
                    + "Profesion = \"" + datosBeneficiario.Profesion + "\", "
                    + "Experiencia_Laboral = \"" + datosBeneficiario.Experiencia_Laboral + "\" "
                    + " WHERE NIF_CIF = \""+diaketas.diaketas.gestorBeneficiarios.NIF_Beneficiario+"\"");
         }
         /*Captura de errores*/
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e);}
         /*Desconexión de la BD*/
         finally {
            if (con.hayConexionBD()) {
                try {
                    con.desconectarBD();
                } catch (SQLException ex) {
                    Logger.getLogger(ONG.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    /*----------------------------Familiares-----------------------------------*/
    public void agregarFamiliar(Familiar familiar){
        ConexionBD con = new ConexionBD();

        con.conectarBD();
        /*Agregamos el nuevo familiar al sistema*/
        /*Convertimos Date para trabajar*/
        java.sql.Timestamp fecha_Nacimiento = new java.sql.Timestamp(familiar.Fecha_Nacimiento.getTime());

        try {
            Statement instruccion = (Statement) con.conexion().createStatement();

            /*Introducimos al nuevo Familiar en el sistema*/
            instruccion.executeUpdate("INSERT INTO Familiar (Nombre_Apellidos, Fecha_Nacimiento, Ocupacion)"
                    + " VALUES (\""+familiar.Nombre_Apellidos + "\",\"" + fecha_Nacimiento + "\",\"" 
                    + familiar.Ocupacion + "\")");
            
            ResultSet rs =instruccion.executeQuery("SELECT MAX(Cod_Familiar) AS Cod_Familiar FROM Familiar");
            if (rs.next())
                familiar.Cod_Familiar = rs.getInt(1);
        }
        /*Captura de errores*/
        catch(SQLException e){ System.out.println(e); }
        catch(Exception e){ System.out.println(e);}
        /*Desconexión de la BD*/
        finally {
            if (con.hayConexionBD()) {
                try {
                    con.desconectarBD();
                } catch (SQLException ex) {
                    Logger.getLogger(ONG.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }         
    }
    
    public Familiar buscarFamiliar(String Nombre_Apellidos){
        ConexionBD con = new ConexionBD();
        
        /* Actualizamos los datos */
        con.conectarBD();

        Familiar familiar = null;

        
        try {
            Statement instruccion = (Statement) con.conexion().createStatement();
            ResultSet rs = instruccion.executeQuery("Select * From Familiar f, Parentesco p "
                    + "WHERE p.Cod_Familiar = f.Cod_Familiar and p.DNI_CIF = \""
                    + this.NIF_CIF+"\" and f.Nombre_Apellidos =\""+Nombre_Apellidos+"\"");
         
            if (rs.next()){
                /*Creamos un familiar con los datos*/
                familiar = new Familiar (rs.getString(2),rs.getDate(3),rs.getString(4));
                /*Indicamos su Codigo Interno*/
                familiar.Cod_Familiar = rs.getInt(1);
            }
         }
         /*Captura de errores*/
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e);}
         /*Desconexión de la BD*/
         finally {
            if (con.hayConexionBD()) {
                try {
                    con.desconectarBD();
                } catch (SQLException ex) {
                    Logger.getLogger(ONG.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }     
        
        return familiar;        
    }
    
    public Parentesco buscarParentesco(String Nombre_Apellidos){
        ConexionBD con = new ConexionBD();
        
        Parentesco parentesco = null;
        
        Familiar familiar = buscarFamiliar(Nombre_Apellidos);
        con.conectarBD();
        try {
            Statement instruccion = (Statement) con.conexion().createStatement();
            ResultSet rs = instruccion.executeQuery("Select Parentesco From Parentesco p "
                    + "WHERE p.Cod_Familiar = \""+ familiar.Cod_Familiar+"\" and p.DNI_CIF = \""
                    + this.NIF_CIF+"\"");
         
            if (rs.next()){
                /*Creamos un familiar con los datos*/
                parentesco = new Parentesco (familiar.Cod_Familiar,this.NIF_CIF,rs.getString(1));
            }
         }
         /*Captura de errores*/
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e);}
         /*Desconexión de la BD*/
         finally {
            if (con.hayConexionBD()) {
                try {
                    con.desconectarBD();
                } catch (SQLException ex) {
                    Logger.getLogger(ONG.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        return parentesco;
    }
}
