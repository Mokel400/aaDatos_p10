package es.fplumara.dam.ad.p10.retos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Verde {

    private static void darDeBajaAntedDe2024(Statement sentencia){
        String sql = "UPDATE socio SET activo = false WHERE fecha_alta < '2024-01-01'";
        try (ResultSet resultado = sentencia.executeQuery(sql){

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



}
