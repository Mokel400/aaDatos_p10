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

    public static List<Socio> convertirAObjetos(Statement sentencia) throws SQLException {
        String sql = "SELECT * FROM socio ORDER BY id";
        BigDecimal cuotaTotal = new BigDecimal(0);
        List<Socio> socios = new ArrayList<>();
        try (ResultSet resultado = sentencia.executeQuery(sql)) {
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
                Socio socio = new Socio(id, nombre, plan, cuota, fechaAlta, activo, estado);
                socios.add(socio);
            }
            for (Socio socio : socios) {
                if (socio.isActivo()){
                    cuotaTotal = cuotaTotal.add(socio.getCuota());
                    System.out.println(socio);
                }
            }
            System.out.println("Cuota total: " + cuotaTotal);

        }
        return socios;
    }


}
