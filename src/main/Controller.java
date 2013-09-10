/**
 * 
 */
package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import model.Tree;

/**
 * @author fpm.kovalenkDV
 * 
 */
public class Controller {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("Enter your name: ");
		BufferedReader inputStream = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			Tree tree = new Tree();
			while (true) {
				String command = inputStream.readLine();
				if ("grow".equals(command))
					System.out.println(tree.grow());
				else if ("shake".equals(command))
					System.out.println(tree.shake());
				else if ("blossom".equals(command))
					System.out.println(tree.blossom());
				else if ("exit".equals(command))
					System.exit(0);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
