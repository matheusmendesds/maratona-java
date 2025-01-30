package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        byte dia = 15;

        switch (dia) {
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sexta");
                break;
            case 6:
                System.out.println("Sabádo");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Opção Invalida");
                break;
        }
        System.out.println(dia);

        char sexo = 'F';
        switch (sexo){
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
        }
        System.out.println(sexo);
    }
}
