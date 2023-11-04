import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class App {
    static Scanner lector = new Scanner(System.in);
    static double generatriz,radio,altura,apotemaPiramide;
    static double perBase,Vol,areaTotal,areaL,areaBase;
    static double diagonal,area,apotema,longitudLados;
    static double radioM,aream,volum,areaCara,Apent;
    static double AM,Am,Pbase,Areabase,a,c;
    static int arista,angulo,cantidadLados;
    static int intentos = 0,intentos1,intentos2,intentos3;
    public static void main(String[] args) throws Exception {
       menu();
    
    }
    public static int menu(){
       System.out.println("Calcular el area lateral,total y volumen.");
       System.out.println("-.-.-**Menu de opciones**-.-.- ");
       System.out.println("1)Prisma");
       System.out.println("2)Cilindro");
       System.out.println("3)Pirámide"); 
       System.out.println("4)Cono");
       System.out.println("5)Esfera");
       System.out.println("6)Zona Esférica");
       System.out.println("7)Casquete Esférico");
       System.out.println("8)Huso esférico y cuña esférica");
       System.out.println("9)Ortoedro");
       System.out.println("10)Tetaedro");
       System.out.println("11)Hexaedro");
       System.out.println("12)Octaedro");
       System.out.println("13)Dodecaedro");
       System.out.println("14)Icosaedro");
       System.out.println("15)Tronco de cono");
       System.out.println("16)Tronco de pirámide");
       System.out.println("17)Salir");
       int opc=0;
       double a1=0,b1=0,c1=0;
       boolean cerrado = false;
       
       do {
        System.out.print("Ingrese una opción: ");
        try {
            opc = lector.nextInt();
            if (opc <= 0) {
                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                intentos++;
            } else {
                break;
            }
        } catch (InputMismatchException e) {
            System.out.println("El valor debe ser un número. Intente nuevamente.");
            lector.nextLine();
            intentos++;
        } catch (NoSuchElementException e) {
            System.out.println("Debe introducir un valor.");
            intentos++;
        }

        if (opc < 1 || opc > 17) {
            intentos1++;
            if (intentos1 >= 3) {
                System.out.println("Has superado el número de intentos. El programa finalizará.");
                System.exit(0);
            }
        } else {
            intentos1 = 0;
        }

    } while (intentos < 3 && (opc < 1 || opc > 17));

              
        switch(opc){
            case 1:
                  do {
                        System.out.print("Cantidad de lados: ");
                        try {
                            cantidadLados = lector.nextInt();
                            if (cantidadLados <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                                intentos++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número entero. Intente nuevamente.");
                            lector.next(); 
                            intentos++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos++;
                            cerrado = true; 
                        }
                    } while (intentos < 3 && !cerrado); 
                    
                    if (intentos == 3) {
                        System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                        break;
                    } 
                    do {
                        System.out.print("Altura: ");
                        if (lector.hasNextDouble()) {
                            altura = lector.nextDouble(); 
                            if (altura <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                                intentos2++;
                            } else {
                                break; 
                            }
                        } else {
                            System.out.println("La entrada no es un número válido. Intente nuevamente."); 
                            lector.next(); 
                            intentos2++;
                        }
                    } while (intentos2 < 3);
                    if (intentos2 == 3) {
                        System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                        break;
                    } 
                
                    do {
                        System.out.print("Longitud de lados: ");
                        try {
                            longitudLados = lector.nextDouble();
                            if (longitudLados <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                                intentos3++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número.");
                            lector.next(); 
                            intentos3++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos3++;
                            cerrado = true; 
                        }
                    } while (intentos3 < 3 && !cerrado); 
                    
                    if (intentos3 == 3) {
                        System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
                    
                  CalcularPrisma (cantidadLados,altura,longitudLados);
           
            break;
            
            case 2:
           
                    do {       
                        System.out.print("Ingrese la altura: ");
                        if (lector.hasNextDouble()) {
                            altura = lector.nextDouble(); 
                            if (altura <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                                intentos++;
                            } else {
                                break; 
                            }
                        } else {
                            System.out.println("La entrada no es un número válido. Intente nuevamente."); 
                            lector.next(); 
                            intentos++;
                        }
                    } while (intentos < 3);
                    if (intentos == 3) {
                        System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                        break;
                    } 
                    do {
                        System.out.print("Ingrese el radio: ");
                        try {
                            radio = lector.nextDouble();
                            if (radio <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                                intentos2++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número. Intente nuevamente.");
                            lector.next(); 
                            intentos2++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos2++;
                            cerrado = true; 
                        }
                    } while (intentos2 < 3 && !cerrado); 
                    
                    if (intentos2 == 3) {
                        System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
                    
                 CalcularCilindro(radio, altura);
      
            break;
            
            case 3:
             
             do {       
                     System.out.print("Ingrese la altura de la piramide: ");
                    if (lector.hasNextDouble()) {
                            altura = lector.nextDouble(); 
                            if (altura <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                                intentos++;
                            } else {
                                break; 
                            }
                        } else {
                            System.out.println("La entrada no es un número válido. Intente nuevamente."); 
                            lector.next(); 
                            intentos++;
                        }
                    } while (intentos < 3);
                    if (intentos == 3) {
                        System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
                    do {
                        System.out.print("Ingrese la cantidad de lados de la piramide: ");
                        try {
                            cantidadLados = lector.nextInt();
                            if (cantidadLados <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                                intentos2++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número. Intente nuevamente.");
                            lector.next(); 
                            intentos2++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos2++;
                            cerrado = true; 
                        }
                    } while (intentos2 < 3 && !cerrado); 
                    
                    if (intentos2 == 3) {
                        System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
                    do {
                        System.out.print("Ingrese el la longitud de lados de la piramide: ");
                        try {
                            longitudLados = lector.nextDouble();
                            if (longitudLados <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                                intentos3++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número. Intente nuevamente.");
                            lector.next(); 
                            intentos3++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos3++;
                            cerrado = true; 
                        }
                    } while (intentos3 < 3 && !cerrado); 
                    
                    if (intentos3 == 3) {
                        System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
                 do {
                        System.out.print("Ingrese el apotema de la piramide: ");
                        try {
                            apotemaPiramide = lector.nextDouble();
                            if (apotemaPiramide <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                                intentos1++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número. Intente nuevamente.");
                            lector.next(); 
                            intentos1++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos1++;
                            cerrado = true; 
                        }
                    } while (intentos1 < 3 && !cerrado); 
                    
                    if (intentos1 == 3) {
                        System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
                    
                  
                  CalcularPiramide( altura,cantidadLados,apotemaPiramide,longitudLados);  
                  
            break;
          case 4:
                              do {       
                        System.out.print("Ingrese la altura del cono: ");
                        if (lector.hasNextDouble()) {
                            altura = lector.nextDouble(); 
                            if (altura <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                                intentos++;
                            } else {
                                break; 
                            }
                        } else {
                            System.out.println("La entrada no es un número válido. Intente nuevamente."); 
                            lector.next(); 
                            intentos++;
                        }
                    } while (intentos < 3);
                    if (intentos == 3) {
                        System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                        break;
                    } 
                    do {
                        System.out.print("Ingrese el radio del cono: ");
                        try {
                            radio = lector.nextDouble();
                            if (radio <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                                intentos2++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número. Intente nuevamente.");
                            lector.next(); 
                            intentos2++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos2++;
                            cerrado = true; 
                        }
                    } while (intentos2 < 3 && !cerrado); 
                    
                    if (intentos2 == 3) {
                        System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
                    

              CalcularCono(radio,altura);

          break;

          case 5:
          do {
            System.out.print("Ingrese el valor del radio: ");
            try {
                radio = lector.nextDouble();
                if (radio <= 0) {
                    System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                    intentos++;
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("El valor debe ser un número. Intente nuevamente.");
                lector.next(); 
                intentos++;
            } catch (NoSuchElementException e) {
                System.out.println("Debe introducir un valor.");
                intentos++;
                cerrado = true; 
            }
        } while (intentos < 3 && !cerrado); 
        
        if (intentos == 3) {
            System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
            break;
        }
           CalcularEsfera(radio);
          break;

           case 6:

                do {       
                     System.out.print("Ingrese la altura: ");
                    if (lector.hasNextDouble()) {
                            altura = lector.nextDouble(); 
                            if (altura <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                                intentos++;
                            } else {
                                break; 
                            }
                        } else {
                            System.out.println("La entrada no es un número válido. Intente nuevamente."); 
                            lector.next(); 
                            intentos++;
                        }
                    } while (intentos < 3);
                    if (intentos == 3) {
                        System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
            
                    do {
                        System.out.print("Ingrese el valor del radio Mayor: ");
                        try {
                            radioM = lector.nextDouble();
                            if (radioM <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                                intentos1++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número. Intente nuevamente.");
                            lector.next(); 
                            intentos1++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos1++;
                            cerrado = true; 
                        }
                    } while (intentos1 < 3 && !cerrado); 
                    
                    if (intentos1 == 3) {
                        System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
                    do {
                        System.out.print("Ingrese el valor del radio: ");
                        try {
                            radio = lector.nextDouble();
                            if (radio <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                                intentos2++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número. Intente nuevamente.");
                            lector.next(); 
                            intentos2++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos2++;
                            cerrado = true; 
                        }
                    } while (intentos2 < 3 && !cerrado); 
                    
                    if (intentos2 == 3) {
                        System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }

                  CalcularZonaEsferica( radio, radioM, altura);
            break;

            case 7:
                 
                    do {       
                        System.out.print("Ingrese la altura: ");
                        if (lector.hasNextDouble()) {
                            altura = lector.nextDouble(); 
                            if (altura <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                                intentos++;
                            } else {
                                break; 
                            }
                        } else {
                            System.out.println("La entrada no es un número válido. Intente nuevamente."); 
                            lector.next(); 
                            intentos++;
                        }
                    } while (intentos < 3);
                    if (intentos == 3) {
                        System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                        break;
                    } 
            do {
                        System.out.print("Ingrese el valor del radio Mayor: ");
                        try {
                            radioM = lector.nextDouble();
                            if (radioM <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                                intentos1++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número. Intente nuevamente.");
                            lector.next(); 
                            intentos1++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos1++;
                            cerrado = true; 
                        }
                    } while (intentos1 < 3 && !cerrado); 
                    
                    if (intentos1 == 3) {
                        System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
                    do {
                        System.out.print("Ingrese el valor del radio: ");
                        try {
                            radio = lector.nextDouble();
                            if (radio <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                                intentos2++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número. Intente nuevamente.");
                            lector.next(); 
                            intentos2++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos2++;
                            cerrado = true; 
                        }
                    } while (intentos2 < 3 && !cerrado); 
                    
                    if (intentos2 == 3) {
                        System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
              
               
               calcularCasqueteEsferico(altura,radio,radioM);
            break;

            case 8:
                do {
                        System.out.print("Ingrese el valor del radio: ");
                        try {
                            radio = lector.nextDouble();
                            if (radio <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                                intentos++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número. Intente nuevamente.");
                            lector.next(); 
                            intentos++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos++;
                            cerrado = true; 
                        }
                    } while (intentos < 3 && !cerrado); 
                    
                    if (intentos == 3) {
                        System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
                    do {
                        System.out.print("Ingrese el valor del ángulo: ");
                        try {
                            angulo = lector.nextInt();
                            if (angulo <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                                intentos1++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número. Intente nuevamente.");
                            lector.next(); 
                            intentos1++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos1++;
                            cerrado = true; 
                        }
                    } while (intentos1 < 3 && !cerrado); 
                    
                    if (intentos1 == 3) {
                        System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
                
                calcularHusoCuñaEsferica(radio,angulo);

            break;

            case 9:
            do {
                   System.out.print("Ingrese el valor de a: ");
                        try {
                            a1 = lector.nextDouble();
                            if (a1 <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                                intentos++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número. Intente nuevamente.");
                            lector.next(); 
                            intentos++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos++;
                            cerrado = true; 
                        }
                    } while (intentos < 3 && !cerrado); 
                    
                    if (intentos == 3) {
                        System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
                     do {
                        System.out.print("Ingrese el valor de b: ");
                        try {
                            b1 = lector.nextDouble();
                            if (b1 <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                                intentos1++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número. Intente nuevamente.");
                            lector.next(); 
                            intentos1++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos1++;
                            cerrado = true; 
                        }
                    } while (intentos1 < 3 && !cerrado); 
                    
                    if (intentos1 == 3) {
                        System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
                    do {
                        System.out.print("Ingrese el valor de c: ");
                        try {
                            c1 = lector.nextDouble();
                            if (c1 <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                                intentos2++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número. Intente nuevamente.");
                            lector.next(); 
                            intentos2++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos2++;
                            cerrado = true; 
                        }
                    } while (intentos2 < 3 && !cerrado); 
                    
                    if (intentos2 == 3) {
                        System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
                  
                 CalcularOrtoedro(a1, b1, c1);
            
            break;

            case 10:
              do {
                        System.out.print("Ingrese el valor de la arista: ");
                        try {
                            arista = lector.nextInt();
                            if (arista <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                                intentos++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número entero. Intente nuevamente.");
                            lector.next(); 
                            intentos++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos++;
                            cerrado = true; 
                        }
                    } while (intentos < 3 && !cerrado); 
                    
                    if (intentos == 3) {
                        System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
                    
            calcularTetaedro(arista);
             
            break;

            case 11:
             do {
                        System.out.print("Ingrese el valor de la arista: ");
                        try {
                            arista = lector.nextInt();
                            if (arista <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                                intentos++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número entero. Intente nuevamente.");
                            lector.next(); 
                            intentos++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos++;
                            cerrado = true; 
                        }
                    } while (intentos < 3 && !cerrado); 
                    
                    if (intentos == 3) {
                        System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
                    

                 calcularHexaedro(arista);
            break;

            case 12:
            do {
                        System.out.print("Ingrese el valor de la arista: ");
                        try {
                            arista = lector.nextInt();
                            if (arista <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                                intentos++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número entero. Intente nuevamente.");
                            lector.next(); 
                            intentos++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos++;
                            cerrado = true; 
                        }
                    } while (intentos < 3 && !cerrado); 
                    
                    if (intentos == 3) {
                        System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
                    
                calcularOctaedro(arista);
            
            break;

            case 13:

             do {
                        System.out.print("Ingrese el valor de la arista: ");
                        try {
                            arista = lector.nextInt();
                            if (arista <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                                intentos++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número entero. Intente nuevamente.");
                            lector.next(); 
                            intentos++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos++;
                            cerrado = true; 
                        }
                    } while (intentos < 3 && !cerrado); 
                    
                    if (intentos == 3) {
                        System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
              
                calcularDodecaedro(arista);
    
            break;

            case 14:
            do {
                        System.out.print("Ingrese el valor de la arista: ");
                        try {
                            arista = lector.nextInt();
                            if (arista <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                                intentos++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número entero. Intente nuevamente.");
                            lector.next(); 
                            intentos++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos++;
                            cerrado = true; 
                        }
                    } while (intentos < 3 && !cerrado); 
                    
                    if (intentos == 3) {
                        System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }

                calcularIcosaedro(arista);

            break;
            
            case 15:
                 do {       
                        System.out.print("Ingrese la altura: ");
                        if (lector.hasNextDouble()) {
                            altura = lector.nextDouble(); 
                            if (altura <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                                intentos++;
                            } else {
                                break; 
                            }
                        } else {
                            System.out.println("La entrada no es un número válido. Intente nuevamente."); 
                            lector.next(); 
                            intentos++;
                        }
                    } while (intentos < 3);
                    if (intentos == 3) {
                        System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                        break;
                    } 
                    do {
                        System.out.print("Ingrese el valor del radio: ");
                        try {
                            radio = lector.nextDouble();
                            if (radio <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                                intentos1++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número. Intente nuevamente.");
                            lector.next(); 
                            intentos1++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos1++;
                            cerrado = true; 
                        }
                    } while (intentos1 < 3 && !cerrado); 
                    
                    if (intentos1 == 3) {
                        System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
                    do {
                        System.out.print("Ingrese el valor del radio Mayor: ");
                        try {
                            radioM = lector.nextDouble();
                            if (radioM <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                                intentos2++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número. Intente nuevamente.");
                            lector.next(); 
                            intentos2++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos2++;
                            cerrado = true; 
                        }
                    } while (intentos2 < 3 && !cerrado); 
                    
                    if (intentos2 == 3) {
                        System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
                   
                  calcularTroncodeCono(altura,radio,radioM);

            break;
            
            case 16:
            do {
                        System.out.print("Ingrese la longitud de la arista mayor: ");
                        try {
                            AM = lector.nextDouble();
                            if (AM <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                                intentos++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número. Intente nuevamente.");
                            lector.next(); 
                            intentos++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos++;
                            cerrado = true; 
                        }
                    } while (intentos < 3 && !cerrado); 
                    
                    if (intentos == 3) {
                        System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
                   
                   do {
                        System.out.print("Ingrese el valor del radio Menor: ");
                        try {
                            Am = lector.nextDouble();
                            if (Am <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                                intentos1++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número. Intente nuevamente.");
                            lector.next(); 
                            intentos1++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos1++;
                            cerrado = true; 
                        }
                    } while (intentos1 < 3 && !cerrado); 
                    
                    if (intentos1 == 3) {
                        System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
                     do {
                        System.out.print("Ingrese el valor de la altura: ");
                        if (lector.hasNextDouble()) {
                            altura = lector.nextDouble(); 
                            if (altura <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                                intentos2++;
                            } else {
                                break; 
                            }
                        } else {
                            System.out.println("La entrada no es un número válido. Intente nuevamente."); 
                            lector.next(); 
                            intentos2++;
                        }
                    } while (intentos2 < 3);
                    if (intentos2 == 3) {
                        System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                        break;
                    } 
                   
                  calcularTroncodepiramide(altura,Am,AM);
      
            break;

            case 17:
                   System.out.println("Ha decidido salir del programa.¡Vuelva pronto!(*u*)");
            break;
            }
           return opc;
      }
       public static void CalcularPrisma(int cantidadLados,double altura,double longitudLados){
         perBase = cantidadLados * longitudLados;
         areaL = perBase * altura;
         double alfa = (Math.PI/180) * (360/cantidadLados);
          apotema = longitudLados / (2 * Math.tan((alfa)/2));
          areaBase = (perBase * apotema)/2;
         areaTotal = areaL + 2 * areaBase;
          Vol = areaBase * altura;

         System.out.println("Area lateral: " + areaL + " unidades cuadradas.");
         System.out.println("Area total: " + areaTotal + " unidades cuadradas.");
         System.out.println("Volumen: " + Vol + " unidades cubicas.");
        
       }

       public static void CalcularCilindro(double radio,double altura){
         perBase = 2*Math.PI*radio;
         areaL = perBase*altura;
         areaBase= Math.PI* (radio*radio);
         areaTotal = 2*Math.PI*radio*(altura + radio);
         Vol = areaBase*altura;
        System.out.println("El Area Lateral del cubo es: " + areaL + " unidades cuadradas");
        System.out.println("El Area Total del cubo es: " + areaTotal + " unidades cuadradas");
        System.out.println("El volumen del cubo es: " + Vol + " unidaes cuadradas");
            }
        
         public static void CalcularPiramide(double altura,int cantidadLados,double apotemaPiramide,double longitudLados){
         perBase = cantidadLados * longitudLados;
         apotemaPiramide = (Math.sqrt(altura*altura)+(apotema*apotema));
         areaL = (perBase*apotemaPiramide)/2;
         areaBase = perBase*2*(apotema+apotemaPiramide);
         areaTotal = (areaL+areaBase);
         Vol = (areaBase+altura)/3;
         System.out.println("El area Lateral de la pirámide es: "+areaL+" unidades cuadradas");
         System.out.println("El area total de la pirámide es "+areaTotal+" unidades cuadrados");
         System.out.println("El volumen de la pirámide es: "+Vol+ " unidades cuadradas");
        }

        public static void CalcularCono(double radio,double altura){
         perBase = (Math.PI*radio);
         generatriz = Math.sqrt((radio*radio)+(altura*altura));
         areaL = perBase*generatriz;
         areaBase = (Math.PI*(radio*radio));
         areaTotal = areaL + areaBase;
         Vol = areaBase*altura/3;
         System.out.println("El area lateral el cono es: "+areaL+" unidades cuadradas");
         System.out.println("El area total del cono es: "+areaTotal+" unidaes cuadradas");
         System.out.println("el volumen del cono es: "+Vol+ " unidades cuadradas");
        }

       public static void  CalcularEsfera(double radio){
          area = 4*Math.PI*(radio*radio);
          Vol = 4.0/3.0*Math.PI*(radio*radio*radio);

         System.out.println("El valor del area es: "+area+" m cuadrados");
         System.out.println("El valor del volumen es: "+Vol+" m cuadrados");
       }

       public static void CalcularZonaEsferica(double radio,double radioM,double altura){
         area = 2*Math.PI*radioM*altura;
         Vol = Math.PI*altura*((altura*altura)+3*radioM+3*radio)/6;

         System.out.println("El area de la zona esferica es: "+area+" cm cuadradas");
         System.out.println("El volumen de la zona esferica es: "+Vol+" cm cuadradas");
       }

       public static void calcularCasqueteEsferico(double altura,double radio,double radioM){
        area = 2*Math.PI*radioM*altura;
        aream = Math.PI*((radio*radio)+(altura*altura));
        Vol = Math.PI*(altura*altura)*(3*radioM-altura)/3;
        volum= Math.PI*altura/6*(3*(radio*radio)+(altura*altura));

        System.out.println("Area en funcion del radio de la esfera: "+area);
        System.out.println("Area en funcion del radio menor: "+aream);
        System.out.println("volumen en funcion del radio de la esfera: "+Vol);
        System.out.println("Area en funcion del radio menor: "+volum);

       }

       public static void calcularHusoCuñaEsferica(double radio,double angulo){
         area = 4*(Math.PI*(radio*radio)*angulo/360);
         Vol = (4.0/3.0)*(Math.PI*(radio*radio*radio)*angulo/360);

         System.out.println("El area del uso esferico es: "+area); 
         System.out.println("El volumen de una cuña esferica es: "+Vol);
       }

       public static void CalcularOrtoedro(double a,double b,double c){
         area = 2*(a*b+a*c+b*c);
         diagonal = Math.sqrt((a*a)+(b*b)+(c*c));
         Vol = a*b*c;
        System.out.println("El valor del area es: "+area+" cm cuadrados");
        System.out.println("El valor del volumen es: "+Vol+" cm cuadrados");
        System.out.println("El valor de la diagonal es: "+diagonal+" cm cuadrados");
       }

       public static void calcularTetaedro(int arista){
             area = ((arista*arista)*Math.sqrt(3));
             altura = (arista*(Math.sqrt(6)/3));
             Vol = ((Math.sqrt(2)/12)*(arista*arista*arista));
    
             System.out.println("El valor del area es: "+area);
             System.out.println("El valor de la altura es: "+altura);
             System.out.println("El valor del volumen es: "+Vol);

       }

       public static void calcularHexaedro(int arista){
        area = (6*(arista*arista));
        Vol = (arista*arista*arista);
       diagonal = (arista*Math.sqrt(3));

       System.out.println("El area del hexaedro es: "+area); 
       System.out.println("El volumen del hexaedro es: "+Vol);
       System.out.println("La diagonal del hexaedro es: "+area);
       }
       
      public static void calcularOctaedro(int arista){
        areaTotal = (2*(arista*arista)*Math.sqrt(3));
        areaCara = areaTotal/8;
        Vol = Math.sqrt(2)/3*(arista*arista*arista);

       System.out.println("El valor del area Total es: "+areaTotal+ " cm cuadrados");
       System.out.println("El valor del area de la cara es: "+areaCara+" cm cuadrados");
       System.out.println("El valor del volumen es: "+Vol+" cm cuadrados");
      }

      public static void calcularDodecaedro(int arista){
         double alfa = 36*(Math.PI/180);
         apotema = (arista/2*Math.tan(alfa));
         area = 3*(arista*arista)*Math.sqrt(25+10*Math.sqrt(5));
         Apent = 5/2*arista*apotema;
         Vol = 1.0/4*(15+7*Math.sqrt(5))*(arista*arista*arista);

         System.out.println("El area del Dodecaedro es: "+area+" cm cuadradas");
         System.out.println("El area de un pentagono del dodecaedro es: "+Apent+" cm cuadradas");
         System.out.println("El volumen del dodecaedro es: "+Vol+" cm cuadradas");
      }

      public static void calcularIcosaedro(int arista){
         areaTotal = (5*(arista*arista)*Math.sqrt(3));
         areaCara = areaTotal/20;
         Vol = ((5.0/12)*(3+ Math.sqrt(5)*arista*arista*arista));

         System.out.println("El valor del area Toltal es: "+areaTotal+" cm cuadrados");
         System.out.println("El valor del area de las caras es: "+areaCara+" cm cuadrados");
         System.out.println("El valor del volumen es: "+Vol+" cm cuadrados");
      }

      public static void calcularTroncodeCono(double altura,double radio,double radioM){
         generatriz = Math.sqrt((altura*altura)+(radioM*radioM-radio*radio));
         areaL = Math.PI*generatriz*(radioM+radio);
         areaBase = Math.PI*radioM;
         Areabase = Math.PI*radio;
         areaTotal = areaL + areaBase+ Areabase;
         Vol = 1.0/3*Math.PI*altura*((radioM*radioM)+(radio*radio)+radioM*radio);


         System.out.println("El area lateral es: "+areaL+" unidades cuadradas");
         System.out.println("El area total es: "+areaTotal+" unidades cuadradas");
         System.out.println("El volumen es: "+Vol+" unidades cuadradas");
      }

      public static void calcularTroncodepiramide(double altura,double Am, double AM){
                c= (AM-Am)/2;
                a = Math.sqrt((altura*altura)+(c*c));
                perBase = AM*altura; 
                Pbase = Am*altura;
                areaL = (perBase+Pbase)/2*a;
                areaBase = (AM*AM);
                Areabase = (Am*Am);
                areaTotal= areaL+areaBase+Areabase;
                Vol = 1.0/3*altura*(areaBase+Areabase+Math.sqrt(areaBase*Areabase));
      
                System.out.println("El area lateral es igual a: "+areaL+" cm cuadradas");
                System.out.println("El area total es igual a: "+areaTotal+" cm cuadradas");
                System.out.println("El volumen es igual a: "+Vol+" cm cuadradas");

      }
       
     }