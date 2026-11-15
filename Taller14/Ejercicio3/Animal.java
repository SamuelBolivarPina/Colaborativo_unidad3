// Clase base
public class Animal {
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }

    // Clase derivada
    public class Perro extends Animal {
        public void correr() {
            System.out.println("El perro está corriendo.");
        }
/*
        // Clase de prueba (incorrecta)
        public class MainError {
            public static void main(String[] args) {
                Animal miAnimal = new Perro();
                // miAnimal.correr(); // ERROR DE COMPILACIÓN: El método correr() no existe en la clase base Animal
            }
        }
    }

 */
    }
}
