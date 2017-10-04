import java.util.Scanner;

//HACER UNA COPIA E IMPRIMIRLO INVERTIDO
//EL USUARIO CREA EL TAMAÑO DEL ARREGLO E INGRESA LOS DATOS POR EL TECLADO

/**
 * @author 16550549
 */
public class Principal {
    public static void main(String[] args) {
        Scanner iCaptu = new Scanner(System.in);
        System.out.println("INGRESA EL TAMAÑO DEL ARREGLO");
        int TAMM_ARRE1 = iCaptu.nextInt(); //TAMAÑO DEL ARREGLO DEL USUARIO       
        int ArreUsuario[] = new int[TAMM_ARRE1]; //SE ASIGNA EL TAMAÑO AL ARREGLO
        int ArreInverso[] = new int[TAMM_ARRE1]; //LA COPIA SERA DEL MISMO TAMAÑO
        
        for (int i = 0; i < ArreUsuario.length; i++) {
         int iValor = 0;
       //CAPTURAR LOS DATOS EN EL PRIMER ARREGLO
         System.out.println("INGRESA LOS VALORES DEL ARREGLO EN LA POCISION " + (i + 1) + "");
         iValor = iCaptu.nextInt();
         ArreUsuario[i] = iValor;

        }
       //IMPRMIR
        for (int i = 0; i < ArreUsuario.length; i++) {
            System.out.println("ARREGLO NORMAL: " + ArreUsuario[i]);
       //LLENAR EL ARREGLO EN FORMA INVERSA E IMPRIMIRLO 
        }
        for (int i = 0, j = ArreUsuario.length - 1; j >= 0; i++, j--) {
            ArreInverso[i] = ArreUsuario[j];
            
        }
        for (int i : ArreInverso) {
            System.out.println("ARREGLO INVERSO: " + i);
        }
        
    }

}
