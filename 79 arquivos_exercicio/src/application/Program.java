package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.println("Localização do Arquivo Origem: ");
		String sourceFileStr = sc.nextLine();
		
		File sourceFile = new File(sourceFileStr);
		String sourceFolderStr = sourceFile.getParent();
		
		boolean success = new File(sourceFolderStr + "\\out").mkdir();
		System.out.println("Pasta criada com sucesso: " + success);
		
		String targetFileStr = sourceFolderStr + "\\out\\summary.csv";
		System.out.println("Arquivo a ser gerado: " + targetFileStr);
		
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
			
			String line = br.readLine();
			
			while (line != null) {
				System.out.println("Lido: " + line);
				
				String[] campo = line.split(",");
				String produto = campo[0];
				double preco = Double.parseDouble(campo[1]);
				int quantidade = Integer.parseInt(campo[2]);
				
				//System.out.println("Item " + produto);
				
				list.add(new Product(produto, preco, quantidade));
				
				line = br.readLine();
			}
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr/*, true*/))) {   // true acrescenta ao final
				for (Product item : list) {
					System.out.println("Gravado: " + item.getProduto() + ' ' + String.format("%.2f", item.valorTotal()));
					bw.write(item.getProduto() + ',' + String.format("%.2f", item.valorTotal()));
					bw.newLine();
				}
				
				System.out.println("Arquivo criado com sucesso: " + targetFileStr);
			}
			
			catch (IOException e) {
				System.out.println("Erro criação na criação do Arquivo: " + e.getMessage());
			}
			

		}
		
		catch (IOException e) {
			System.out.println("Erro criação e localização Pasta/Arquivo: " + e.getMessage());
		}
		
		finally {
			if (sc != null) {
				sc.close();
			}
		}
	}

}
