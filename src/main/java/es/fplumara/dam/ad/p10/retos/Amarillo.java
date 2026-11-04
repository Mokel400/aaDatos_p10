package es.fplumara.dam.ad.p10.retos;

import es.fplumara.dam.ad.p10.modelo.Socio;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Amarillo {

    private static List<Socio> convertirAObjetos(Statement sentencia) throws SQLException {
        String sql = "SELECT * FROM socio ORDER BY id";
        List<Socio> socios = new ArrayList<>();
        try (ResultSet resultado = sentencia.executeQuery(sql)) {
            int total = 0;
            System.out.println("ID | Nombre                   | Plan     | Cuota | Alta       | Estado");
            while (resultado.next()){
                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre");
                String plan = resultado.getString("plan");
                BigDecimal cuota = resultado.getBigDecimal("cuota");
                Date fechaAlta = resultado.getDate("fecha_alta");
                boolean activo = resultado.getBoolean("activo");
                String estado = "baja";
                if (activo){
                    estado = "activo";
                }
                System.out.printf("%2d | %-24s | %-8s | %5s | %s | %s%n",
                        id, nombre, plan, cuota, fechaAlta, estado);
                total++;
            }
            System.out.println("Socios totales: " + total);
        }
        return socios;
    }


}
