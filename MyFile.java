import java.io.File;

public class MyFile {

    public static void main(String[] args) {
        // Ruta de la carpeta que deseas listar
        String rutaCarpeta = "C:\\Users\\PC\\Desktop\\Prueba";

        // Crear un objeto File con la ruta de la carpeta
        File carpeta = new File(rutaCarpeta);

        // Verificar si la carpeta existe
        if (carpeta.exists() && carpeta.isDirectory()) {
            // Obtener la lista de archivos en la carpeta
            File[] archivos = carpeta.listFiles();

            // Mostrar los nombres de los archivos
            System.out.println("Archivos en la carpeta:");
            for (File archivo : archivos) {
                System.out.println(archivo.getName());
            }
        } else {
            System.out.println("La carpeta no existe o no es válida.");
        }
    }
}
