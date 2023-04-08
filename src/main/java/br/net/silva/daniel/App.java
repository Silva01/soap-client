package br.net.silva.daniel;

import br.net.silva.daniel.domain.soap.domain.SoapService;
import br.net.silva.daniel.domain.soap.dto.SoapResponseDTO;
import br.net.silva.daniel.domain.soap.interfaces.Soap;
import br.net.silva.daniel.domain.soap.usercase.NameSearchUseCase;
import br.net.silva.daniel.domain.soap.usercase.SumUseCase;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Soap<SoapResponseDTO> soap = new SoapService();
        NameSearchUseCase nameSearchUseCase = new NameSearchUseCase(soap);
        SumUseCase sumUseCase = new SumUseCase(soap);

        System.out.println( "Digite um dos numeros abaixo para executar" );
        System.out.println( "1 - Somar 2 numeros" );
        System.out.println( "2 - Pesquisar Nome" );

        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.println( "Digite o numero primeiro numero para somar" );
            int number1 = scanner.nextInt();
            System.out.println( "Digite o numero segundo numero para somar" );
            int number2 = scanner.nextInt();
            sumUseCase.addNumber(number1, number2);
            System.out.println("Resposta: ");
            System.out.println(sumUseCase.execute().getResponse());
        } else if (opcao == 2) {
            System.out.println( "Digite o nome para pesquisar" );
            String name = scanner.next();
            nameSearchUseCase.addName(name);
            System.out.println("Resposta: ");
            System.out.println(nameSearchUseCase.execute().getResponse());
        } else {
            System.out.println("Opção inválida");
        }
    }
}
