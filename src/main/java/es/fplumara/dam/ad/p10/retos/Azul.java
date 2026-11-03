package es.fplumara.dam.ad.p10.retos;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Azul {

    public static void listarSociosConPlanCompleto(Statement sentencia) throws SQLException {
        String sql = "SELECT * FROM socio WHERE plan = 'Completo' ORDER BY fecha_alta ASC";
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
            System.out.println("Socios con plan completo totales: " + total);
        }
    }
}
