import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Scrimish extends JFrame implements ActionListener{
	private static ArrayList<Card> userPile1 = new ArrayList<Card>(); 
	private static ArrayList<Card> userPile2 = new ArrayList<Card>(); 
	private static ArrayList<Card> userPile3 = new ArrayList<Card>();
	private static ArrayList<Card> userPile4 = new ArrayList<Card>();
	private static ArrayList<Card> userPile5 = new ArrayList<Card>();
	private static ArrayList<Card> compPile1 = new ArrayList<Card>();
	private static ArrayList<Card> compPile2 = new ArrayList<Card>();
	private static ArrayList<Card> compPile3 = new ArrayList<Card>();
	private static ArrayList<Card> compPile4 = new ArrayList<Card>();
	private static ArrayList<Card> compPile5 = new ArrayList<Card>();
	private static ArrayList<String> allUserCards = new ArrayList<>(); 
	private static ArrayList<String> allCompCards = new ArrayList<>();
	
	public static boolean canUse(ArrayList<String> a, String attackType, int max){
		int count = 0; 
		for (int i = 0; i < a.size(); i++){
			if (a.get(i).equals(attackType))
				count ++; 
		}
		if (count == max)
			return false; 
		return true; 
	}
	public Scrimish(){
		super();
		super.setSize(400, 400);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton start = new JButton("Start");
		JButton leave = new JButton("Leave");
		leave.setVisible(true);
		leave.addActionListener(this);
		start.addActionListener(this);
		start.setVisible(true);
		super.add(new JPanel().add(start));
		super.setVisible(true);
	}
	public static int randomNumber(){
		Random integer = new Random(); 
		return integer.nextInt(9); 
	}
	public static void randomizePile(){
		while (compPile1.size() < 5){
			int random = new Random().nextInt(9); 
			switch (random){
			case 0:
				if (canUse(allCompCards, "C", 1)){
					allCompCards.add("C");
					compPile1.add(new Card("C"));
				}
				break;
			case 1: 
				if (canUse(allCompCards, "S", 2)){
					allCompCards.add("S");
					compPile1.add(new Card("S"));
				}
				break;
			case 2: 
				if (canUse(allCompCards, "A", 2)){
					allCompCards.add("A"); 
					compPile1.add(new Card("A")); 
				}
				break;
			case 3:
				if (canUse(allCompCards, "1", 5)){
					allCompCards.add("1"); 
					compPile1.add(new Card("1")); 
				}
				break;
			case 4:
				if (canUse(allCompCards, "2", 5)){
					allCompCards.add("2"); 
					compPile1.add(new Card("2")); 
				}
				break;
			case 5:
				if (canUse(allCompCards, "3", 3)){
					allCompCards.add("3"); 
					compPile1.add(new Card("3")); 
				}
				break;
			case 6:
				if (canUse(allCompCards, "4", 3)){
					allCompCards.add("4"); 
					compPile1.add(new Card("4")); 
				}
				break;
			case 7:
				if (canUse(allCompCards, "5", 2)){
					allCompCards.add("5"); 
					compPile1.add(new Card("5")); 
				}
				break;
			case 8:
				if (canUse(allCompCards, "6", 2)){
					allCompCards.add("6"); 
					compPile1.add(new Card("6")); 
				}
				break;
			}
		}
		while (compPile2.size() < 5){
			int random = new Random().nextInt(9); 
			switch (random){
			case 0:
				if (canUse(allCompCards, "C", 1)){
					allCompCards.add("C");
					compPile2.add(new Card("C"));
				}
				break;
			case 1: 
				if (canUse(allCompCards, "S", 2)){
					allCompCards.add("S");
					compPile2.add(new Card("S"));
				}
				break;
			case 2: 
				if (canUse(allCompCards, "A", 2)){
					allCompCards.add("A"); 
					compPile2.add(new Card("A")); 
				}
				break;
			case 3:
				if (canUse(allCompCards, "1", 5)){
					allCompCards.add("1"); 
					compPile2.add(new Card("1")); 
				}
				break;
			case 4:
				if (canUse(allCompCards, "2", 5)){
					allCompCards.add("2"); 
					compPile2.add(new Card("2")); 
				}
				break;
			case 5:
				if (canUse(allCompCards, "3", 3)){
					allCompCards.add("3"); 
					compPile2.add(new Card("3")); 
				}
				break;
			case 6:
				if (canUse(allCompCards, "4", 3)){
					allCompCards.add("4"); 
					compPile2.add(new Card("4")); 
				}
				break;
			case 7:
				if (canUse(allCompCards, "5", 2)){
					allCompCards.add("5"); 
					compPile2.add(new Card("5")); 
				}
				break;
			case 8:
				if (canUse(allCompCards, "6", 2)){
					allCompCards.add("6"); 
					compPile2.add(new Card("6")); 
				}
				break;
			}
		}
		
		while (compPile3.size() < 5){
			int random = new Random().nextInt(9);
			switch (random){
			case 0:
				if (canUse(allCompCards, "C", 1)){
					allCompCards.add("C");
					compPile3.add(new Card("C"));
				}
				break;
			case 1: 
				if (canUse(allCompCards, "S", 2)){
					allCompCards.add("S");
					compPile3.add(new Card("S"));
				}
				break;
			case 2: 
				if (canUse(allCompCards, "A", 2)){
					allCompCards.add("A"); 
					compPile3.add(new Card("A")); 
				}
				break;
			case 3:
				if (canUse(allCompCards, "1", 5)){
					allCompCards.add("1"); 
					compPile3.add(new Card("1")); 
				}
				break;
			case 4:
				if (canUse(allCompCards, "2", 5)){
					allCompCards.add("2"); 
					compPile3.add(new Card("2")); 
				}
				break;
			case 5:
				if (canUse(allCompCards, "3", 3)){
					allCompCards.add("2"); 
					compPile3.add(new Card("2")); 
				}
				break;
			case 6:
				if (canUse(allCompCards, "4", 3)){
					allCompCards.add("4"); 
					compPile3.add(new Card("4")); 
				}
				break;
			case 7:
				if (canUse(allCompCards, "5", 2)){
					allCompCards.add("5"); 
					compPile3.add(new Card("5")); 
				}
				break;
			case 8:
				if (canUse(allCompCards, "6", 2)){
					allCompCards.add("6"); 
					compPile3.add(new Card("6")); 
				}
				break;
			}
		}
		
		while (compPile4.size() < 5){
			int random = randomNumber(); 
			switch (random){
			case 0:
				if (canUse(allCompCards, "C", 1)){
					allCompCards.add("C");
					compPile4.add(new Card("C"));
				}
				break;
			case 1: 
				if (canUse(allCompCards, "S", 2)){
					allCompCards.add("S");
					compPile4.add(new Card("S"));
				}
				break;
			case 2: 
				if (canUse(allCompCards, "A", 2)){
					allCompCards.add("A"); 
					compPile4.add(new Card("A")); 
				}
				break;
			case 3:
				if (canUse(allCompCards, "1", 5)){
					allCompCards.add("1"); 
					compPile4.add(new Card("1")); 
				}
				break;
			case 4:
				if (canUse(allCompCards, "2", 5)){
					allCompCards.add("2"); 
					compPile4.add(new Card("2")); 
				}
				break;
			case 5:
				if (canUse(allCompCards, "3", 3)){
					allCompCards.add("3"); 
					compPile4.add(new Card("3")); 
				}
				break;
			case 6:
				if (canUse(allCompCards, "4", 3)){
					allCompCards.add("4"); 
					compPile4.add(new Card("4")); 
				}
				break;
			case 7:
				if (canUse(allCompCards, "5", 2)){
					allCompCards.add("5"); 
					compPile4.add(new Card("5")); 
				}
				
				break;
			case 8:
				if (canUse(allCompCards, "6", 2)){
					allCompCards.add("6"); 
					compPile4.add(new Card("6")); 
				}
				break;
			}
		}
		
		while (compPile5.size() < 5){
			int random = randomNumber(); 
			switch (random){
			case 0:
				if (canUse(allCompCards, "C", 1)){
					allCompCards.add("C");
					compPile5.add(new Card("C"));
				}
				break;
			case 1: 
				if (canUse(allCompCards, "S", 2)){
					allCompCards.add("S");
					compPile5.add(new Card("S"));
				}
				
				break;
			case 2: 
				if (canUse(allCompCards, "A", 2)){
					allCompCards.add("A"); 
					compPile5.add(new Card("A")); 
				}
				break;
			case 3:
				if (canUse(allCompCards, "1", 5)){
					allCompCards.add("1"); 
					compPile5.add(new Card("1")); 
				}
				break;
			case 4:
				if (canUse(allCompCards, "2", 5)){
					allCompCards.add("2"); 
					compPile5.add(new Card("2")); 
				}
				break;
			case 5:
				if (canUse(allCompCards, "3", 3)){
					allCompCards.add("3"); 
					compPile5.add(new Card("3")); 
				}
				break;
			case 6:
				if (canUse(allCompCards, "4", 3)){
					allCompCards.add("4"); 
					compPile5.add(new Card("4")); 
				}
				break;
			case 7:
				if (canUse(allCompCards, "5", 2)){
					allCompCards.add("5"); 
					compPile5.add(new Card("5")); 
				}
				break;
			case 8:
				if (canUse(allCompCards, "6", 2)){
					allCompCards.add("6"); 
					compPile5.add(new Card("6")); 
				}
				break;
			}
		}
		for (int i = 0; i < compPile1.size(); i++){
			if (compPile1.get(i).equals(new Card("C"))){
				Collections.swap(compPile1, i, 0); 
			return;
		}
	}
		for (int i = 0; i < compPile2.size(); i++){
			if (compPile2.get(i).equals(new Card("C"))){
				Collections.swap(compPile2, i, 0); 
			return;
		}
	}
		for (int i = 0; i < compPile3.size(); i++){
			if (compPile3.get(i).equals(new Card("C"))){
				Collections.swap(compPile3, i, 0); 
			return;
		}
	}
		for (int i = 0; i < compPile4.size(); i++){
			if (compPile4.get(i).equals(new Card("C"))){
				Collections.swap(compPile4, i, 0);
			return;
		}
	}
		for (int i = 0; i < compPile5.size(); i++){
			if (compPile5.get(i).equals(new Card("C"))){
				Collections.swap(compPile5, i, 0);
			return;
		}
	}
	}
	
	public static void initializeCards(){
		JFrame menu = new JFrame();
		menu.setSize(500, 500);
		JPanel selection = new JPanel();
		JTextArea piles = new JTextArea();  
		piles.setText("User Pile 1: " + userPile1.toString()); 
		selection.add(piles);
		menu.add(selection);
		menu.setVisible(true);
		while (userPile1.size() < 5){
			String text = JOptionPane.showInputDialog("please enter a card for pile 1");
			switch (text){
			case "C":
				if (canUse(allUserCards, "C", 1)){
					allUserCards.add("C");
					userPile1.add(new Card("C"));
					piles.setText("User Pile 1: " + userPile1.toString());
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue;
				}
				break;
			case "A": 
				if (canUse(allUserCards, "A", 2)){
					allUserCards.add("A"); 
					userPile1.add(new Card("A"));
					piles.setText("User Pile 1" + userPile1.toString());
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue;
				}
				break;
			case "S":
				if (canUse(allUserCards, "S", 2)){
					allUserCards.add("S"); 
					userPile1.add(new Card("S"));
					piles.setText("User Pile 1: " + userPile1.toString());
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue; 
				}
				break;
			case "1": 
				if (canUse(allUserCards, "1", 5)){
					allUserCards.add("1"); 
					userPile1.add(new Card("1")); 
					piles.setText("User Pile 1: " + userPile1.toString()) ;
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue;
				}
				break;
			case "2":
				if (canUse(allUserCards, "2", 5)){
					allUserCards.add("2"); 
					userPile1.add(new Card("2"));
					piles.setText("User Pile 1:" + userPile1.toString());
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue;
				}
				break;
			case "3": 
				if (canUse(allUserCards, "3", 3)){
					allUserCards.add("3"); 
					userPile1.add(new Card("3")); 
					piles.setText("User Pile 1: " + userPile1.toString());
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue;
				}
				break;
			case "4": 
				if (canUse(allUserCards, "4", 3)){
					allUserCards.add("4"); 
					userPile1.add(new Card("4")); 
					piles.setText("User Pile 1: " + userPile1.toString());
					
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue;
				}
				break;
			case "5": 
				if (canUse(allUserCards, "5", 2)){
					allUserCards.add("5"); 
					userPile1.add(new Card("5")); 
					piles.setText("User Pile 1: " + userPile1.toString());
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue;
				}
				break;
			case "6":
				if (canUse(allUserCards, "6", 2)){
					allUserCards.add("6"); 
					userPile1.add(new Card("6")); 
					piles.setText("User Pile 1 : " + userPile1.toString());
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue;
				} 
				break;
			default:
				JOptionPane.showMessageDialog(null, "Invalid card type. ");
				break;
			}
		}
		while (userPile2.size() < 5){
			String text = JOptionPane.showInputDialog("please enter a card for pile 2");
			switch (text){
			case "C":
				if (canUse(allUserCards, "C", 1)){
					allUserCards.add("C");
					userPile2.add(new Card("C"));
					piles.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString());
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue;
				}
				break;
			case "A": 
				if (canUse(allUserCards, "A", 2)){
					allUserCards.add("A"); 
					userPile2.add(new Card("A"));
					piles.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString());
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue;
				}
				break;
			case "S":
				if (canUse(allUserCards, "S", 2)){
					allUserCards.add("S"); 
					userPile2.add(new Card("S")); 
					piles.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString());
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue;
				}
				break;
			case "1": 
				if (canUse(allUserCards, "1", 5)){
					allUserCards.add("1"); 
					userPile2.add(new Card("1")); 
					piles.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString());
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue; 
				}
				break;
			case "2":
				if (canUse(allUserCards, "2", 5)){
					allUserCards.add("2"); 
					userPile2.add(new Card("2")); 
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue;
				}
				break;
			case "3": 
				if (canUse(allUserCards, "3", 3)){
					allUserCards.add("3"); 
					userPile2.add(new Card("3")); 
					piles.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString());
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue;
				}
				break;
			case "4": 
				if (canUse(allUserCards, "4", 3)){
					allUserCards.add("4"); 
					userPile2.add(new Card("4")); 
					piles.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString());
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue; 
				}
				break;
			case "5": 
				if (canUse(allUserCards, "5", 2)){
					allUserCards.add("5"); 
					userPile2.add(new Card("5"));
					piles.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString());
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue;
				}
				break;
			case "6":
				if (canUse(allUserCards, "6", 2)){
					allUserCards.add("6"); 
					userPile2.add(new Card("6")); 
					piles.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString());
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue;
				}
				break;
			default:
				JOptionPane.showMessageDialog(null, "Invalid card.");
				break;
			}
		}
		while (userPile3.size() < 5){
			String text = JOptionPane.showInputDialog("please enter a card for pile 3"); 
			switch (text){
			case "C":
				if (canUse(allUserCards, "C", 1)){
					allUserCards.add("C");
					userPile3.add(new Card("C"));
					piles.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + " \nUser Pile 3: " + userPile3.toString());
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue;
				}
				break;
			case "A": 
				if (canUse(allUserCards, "A", 2)){
					allUserCards.add("A"); 
					userPile3.add(new Card("A"));
					piles.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + " \nUser Pile 3: " + userPile3.toString());
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue;
				}
				break;
			case "S":
				if (canUse(allUserCards, "S", 2)){
					allUserCards.add("S"); 
					userPile3.add(new Card("S"));
					piles.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + " \nUser Pile 3: " + userPile3.toString());
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue;
				}
				break;
			case "1": 
				if (canUse(allUserCards, "1", 5)){
					allUserCards.add("1"); 
					userPile3.add(new Card("1")); 
					piles.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + " \nUser Pile 3: " + userPile3.toString());
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue; 
				}
				break;
			case "2":
				if (canUse(allUserCards, "2", 5)){
					allUserCards.add("2"); 
					userPile3.add(new Card("2"));
					piles.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + " \nUser Pile 3: " + userPile3.toString());
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue;
				}
				break;
			case "3": 
				if (canUse(allUserCards, "3", 3)){
					allUserCards.add("3"); 
					userPile3.add(new Card("3")); 
					piles.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + " \nUser Pile 3: " + userPile3.toString());
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue;
				}
				break;
			case "4": 
				if (canUse(allUserCards, "4", 3)){
					allUserCards.add("4"); 
					userPile3.add(new Card("4")); 
					piles.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + " \nUser Pile 3: " + userPile3.toString());
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue; 
				}
				break;
			case "5": 
				if (canUse(allUserCards, "5", 2)){
					allUserCards.add("5"); 
					userPile3.add(new Card("5"));
					piles.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + " \nUser Pile 3: " + userPile3.toString());
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue; 
				}
				break;
			case "6":
				if (canUse(allUserCards, "6", 2)){
					allUserCards.add("6"); 
					userPile3.add(new Card("6")); 
					piles.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + " \nUser Pile 3: " + userPile3.toString());
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue;
				}
				break;
			default:
				JOptionPane.showMessageDialog(null, "Invalid input.");
				break;
			}
		}
		while (userPile4.size() < 5){
			String text = JOptionPane.showInputDialog("please enter a card for pile 4");
			switch (text){
			case "C":
				if (canUse(allUserCards, "C", 1)){
					allUserCards.add("C");
					userPile4.add(new Card("C"));
					piles.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + " \nUser Pile 3: " + userPile3.toString()
					+ "\nUser Pile 4: " + userPile4.toString());
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue;
				}
				break;
			case "A": 
				if (canUse(allUserCards, "A", 2)){
					allUserCards.add("A"); 
					userPile4.add(new Card("A"));
					piles.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + " \nUser Pile 3: " + userPile3.toString()
					+ "\nUser Pile 4: " + userPile4.toString());
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue; 
				}
				break;
			case "S":
				if (canUse(allUserCards, "S", 2)){
					allUserCards.add("S"); 
					userPile4.add(new Card("S")); 
					piles.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + " \nUser Pile 3: " + userPile3.toString()
					+ "\nUser Pile 4: " + userPile4.toString());
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue; 
				}
				break;
			case "1": 
				if (canUse(allUserCards, "1", 5)){
					allUserCards.add("1"); 
					userPile4.add(new Card("1")); 
					piles.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + " \nUser Pile 3: " + userPile3.toString()
					+ "\nUser Pile 4: " + userPile4.toString());
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue;
				}
				break; 
			case "2":
				if (canUse(allUserCards, "2", 5)){
					allUserCards.add("2"); 
					userPile4.add(new Card("2")); 
					piles.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + " \nUser Pile 3: " + userPile3.toString()
					+ "\nUser Pile 4: " + userPile4.toString());
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue;
				}
				break;
			case "3": 
				if (canUse(allUserCards, "3", 3)){
					allUserCards.add("3"); 
					userPile4.add(new Card("3"));
					piles.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + " \nUser Pile 3: " + userPile3.toString()
					+ "\nUser Pile 4: " + userPile4.toString());
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue;
				}
				break;
			case "4": 
				if (canUse(allUserCards, "4", 3)){
					allUserCards.add("4"); 
					userPile4.add(new Card("4")); 
					piles.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + " \nUser Pile 3: " + userPile3.toString()
					+ "\nUser Pile 4: " + userPile4.toString());
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue;
				}
				break;
			case "5": 
				if (canUse(allUserCards, "5", 2)){
					allUserCards.add("5"); 
					userPile4.add(new Card("5")); 
					piles.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + " \nUser Pile 3: " + userPile3.toString()
					+ "\nUser Pile 4: " + userPile4.toString());
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue; 
				}
				break;
			case "6":
				if (canUse(allUserCards, "6", 2)){
					allUserCards.add("6"); 
					userPile4.add(new Card("6")); 
					piles.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + " \nUser Pile 3: " + userPile3.toString()
					+ "\nUser Pile 4: " + userPile4.toString());
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue;
				}
				break;
			default:
				JOptionPane.showMessageDialog(null, "Invalid card.");
				break;
			}
		}
		while (userPile5.size() < 5){
			String text = JOptionPane.showInputDialog("please enter a card for pile 5");
			switch (text){
			case "C":
				if (canUse(allUserCards, "C", 1)){
					allUserCards.add("C");
					userPile5.add(new Card("C"));
					piles.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + " \nUser Pile 3: " + userPile3.toString()
					+ "\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() );
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue;
				}
				break;
			case "A": 
				if (canUse(allUserCards, "A", 2)){
					allUserCards.add("A"); 
					userPile5.add(new Card("A"));
					piles.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + " \nUser Pile 3: " + userPile3.toString()
					+ "\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() );
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue;
				}
				break;
			case "S":
				if (canUse(allUserCards, "S", 2)){
					allUserCards.add("S"); 
					userPile5.add(new Card("S")); 
					piles.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + " \nUser Pile 3: " + userPile3.toString()
					+ "\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() );
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue; 
				}
				break;
			case "1": 
				if (canUse(allUserCards, "1", 5)){
					allUserCards.add("1"); 
					userPile5.add(new Card("1")); 
					piles.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + " \nUser Pile 3: " + userPile3.toString()
					+ "\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() );
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue;
				}
				break;
			case "2":
				if (canUse(allUserCards, "2", 5)){
					allUserCards.add("2"); 
					userPile5.add(new Card("2"));
					piles.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + " \nUser Pile 3: " + userPile3.toString()
					+ "\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() );
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue; 
				}
				break;
			case "3": 
				if (canUse(allUserCards, "3", 3)){
					allUserCards.add("3"); 
					userPile5.add(new Card("3")); 
					piles.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + " \nUser Pile 3: " + userPile3.toString()
					+ "\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() );
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue;
				}
				break;
			case "4": 
				if (canUse(allUserCards, "4", 3)){
					allUserCards.add("4"); 
					userPile5.add(new Card("4"));
					piles.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + " \nUser Pile 3: " + userPile3.toString()
					+ "\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() );
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue; 
				}
				break;
			case "5": 
				if (canUse(allUserCards, "5", 2)){
					allUserCards.add("5"); 
					userPile5.add(new Card("5")); 
					piles.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + " \nUser Pile 3: " + userPile3.toString()
					+ "\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() );
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue; 
				}
				break;
			case "6":
				if (canUse(allUserCards, "6", 2)){
					allUserCards.add("6"); 
					userPile5.add(new Card("6")); 
					piles.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + " \nUser Pile 3: " + userPile3.toString()
					+ "\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() );
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot exceed max amount of card.");
					continue;
				}
				break;
			default:
				JOptionPane.showMessageDialog(null, "Invalid card.");
				break;
			}
		}
	}

	public static void crownBottom(){
		randomizePile(); 
		for (int i = 0; i < userPile1.size(); i++){
			if (userPile1.get(i).equals(new Card("C"))){
				Collections.swap(userPile1, i, 0); 
				return;
			}
		}
		for (int i = 0; i < userPile2.size(); i++){
			if (userPile2.get(i).equals(new Card("C"))){
				Collections.swap(userPile2, i, 0);  
			return;
		}
	}
		for (int i = 0; i < userPile3.size(); i++){
			if (userPile3.get(i).equals(new Card("C"))){
				Collections.swap(userPile3, i, 0); 
			return;
		}
	}
		for (int i = 0; i < userPile4.size(); i++){
			if (userPile4.get(i).equals(new Card("C"))){
				Collections.swap(userPile4, i, 0); 
			return;
		}
	}
		for (int i = 0; i < userPile5.size(); i++){
			if (userPile5.get(i).equals(new Card("C"))){
				Collections.swap(userPile5, i, 0); 
			return;
		}
	}
}
	public static void main(String[] args){
		new Scrimish(); 
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		new Game(); 
	}
	
	class Game {
		JFrame game = new JFrame();
		JTextArea displayCards = new JTextArea();
		int result; 
		boolean hasWon = false;
		boolean hasLost = false;
		public Game(){
			initializeCards();
			crownBottom(); 
			displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
					"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
					"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
					+ "\nComp pile 5: " + compPile5.toString());
			JFrame game = new JFrame();
			JPanel window = new JPanel();
			game.setSize(500, 500);
			game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.add(displayCards);
			game.add(window); 
			game.setVisible(true);
		while (hasWon == false | hasLost == false){
			int attackPile = Integer.parseInt(JOptionPane.showInputDialog("Enter pile you want to attack with."));
			int pileAttacked = Integer.parseInt(JOptionPane.showInputDialog("Enter opponent pile you want to attack."));
			if (attackPile == 1){
				switch(pileAttacked){
				case 1:
					result = userPile1.get(userPile1.size()-1).attack(compPile1.get(compPile1.size()-1));
					if (result == -1){
						JOptionPane.showMessageDialog(null, "Computer won.");
						userPile1.remove(userPile1.size()-1); 
						displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
								"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
								"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
								+ "\nComp pile 5: " + compPile5.toString());
					}
					else if (result == 0){
						JOptionPane.showMessageDialog(null, "No winner.");
					}
					else if (result == 1){
						JOptionPane.showMessageDialog(null, "User card wins!");
						compPile1.remove(compPile1.size()-1);
						displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
								"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
								"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
								+ "\nComp pile 5: " + compPile5.toString());
					}
					else if (result == 2){
						JOptionPane.showMessageDialog(null, "You win the game!");
						hasWon = true;
						System.exit(0);
					}
					else if (result == -2){
						JOptionPane.showMessageDialog(null, "You lost the game.");
						hasLost = true;
						System.exit(0);
					}
					else {
						JOptionPane.showMessageDialog(null, "Both cards lose.");
						compPile1.remove(compPile1.size()-1);
						userPile1.remove(userPile1.size()-1);
						displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
								"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
								"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
								+ "\nComp pile 5: " + compPile5.toString());
					}
					break;
				case 2:
					result = userPile1.get(userPile1.size()-1).attack(compPile2.get(compPile2.size()-1));
					if (result == -1){
						JOptionPane.showMessageDialog(null, "Computer won.");
						userPile1.remove(userPile1.size()-1); 
						displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
								"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
								"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
								+ "\nComp pile 5: " + compPile5.toString());
					}
					else if (result == 0){
						JOptionPane.showMessageDialog(null, "No winner.");
					}
					else if (result == 1){
						JOptionPane.showMessageDialog(null, "User wins!");
						compPile2.remove(compPile2.size()-1);
						displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
								"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
								"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
								+ "\nComp pile 5: " + compPile5.toString());
					}
					else if (result == -2){
						JOptionPane.showMessageDialog(null, "User has lost");
						hasLost = true;
						System.exit(0);
					}
					else if (result == 2){
						JOptionPane.showMessageDialog(null, "You win the game!");
						hasWon = true;
						System.exit(0);
					}
					else {
						JOptionPane.showMessageDialog(null, "Both cards lose.");
						compPile2.remove(compPile2.size()-1);
						userPile1.remove(userPile1.size()-1);
						displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
								"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
								"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
								+ "\nComp pile 5: " + compPile5.toString());
					}
					break;
				case 3: 
					result = userPile1.get(userPile1.size()-1).attack(compPile3.get(compPile3.size()-1));
					if (result == -1){
						JOptionPane.showMessageDialog(null, "Computer won.");
						userPile1.remove(userPile1.size()-1); 
						displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
								"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
								"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
								+ "\nComp pile 5: " + compPile5.toString());
					}
					else if (result == 0){
						JOptionPane.showMessageDialog(null, "No winner.");
					}
					else if (result == 1){
						JOptionPane.showMessageDialog(null, "User wins!");
						compPile3.remove(compPile3.size()-1);
						displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
								"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
								"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
								+ "\nComp pile 5: " + compPile5.toString());
					}
					else if (result == 2){
						JOptionPane.showMessageDialog(null, "You win the game!");
						hasWon = true;
						System.exit(0);
					}
					else if (result == -2){
						JOptionPane.showMessageDialog(null, "User lost the game!");
						hasLost = true;
						System.exit(0);
					}
					else {
						JOptionPane.showMessageDialog(null, "Both cards lose.");
						compPile3.remove(compPile3.size()-1);
						userPile1.remove(userPile1.size()-1);
						displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
								"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
								"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
								+ "\nComp pile 5: " + compPile5.toString());
					}
					break;
				case 4:
					result = userPile1.get(userPile1.size()-1).attack(compPile4.get(compPile4.size()-1));
					if (result == -1){
						JOptionPane.showMessageDialog(null, "Computer won.");
						userPile1.remove(userPile1.size()-1); 
						displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
								"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
								"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
								+ "\nComp pile 5: " + compPile5.toString());
					}
					else if (result == 0){
						JOptionPane.showMessageDialog(null, "No winner.");
					}
					else if (result == 1){
						JOptionPane.showMessageDialog(null, "User wins!");
						compPile4.remove(compPile4.size()-1);
						displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
								"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
								"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
								+ "\nComp pile 5: " + compPile5.toString());
					}
					else if (result == 2){
						JOptionPane.showMessageDialog(null, "You win the game!");
						hasWon = true;
						System.exit(0);
					}
					else if (result == -2){
						JOptionPane.showMessageDialog(null, "You lost the game");
						hasLost = true;
						System.exit(0);
					}
					else {
						JOptionPane.showMessageDialog(null, "Both cards lose.");
						compPile4.remove(compPile4.size()-1);
						userPile1.remove(userPile1.size()-1);
						displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
								"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
								"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
								+ "\nComp pile 5: " + compPile5.toString());
					}
					break;
				case 5:
					result = userPile1.get(userPile1.size()-1).attack(compPile5.get(compPile5.size()-1));
					if (result == -1){
						JOptionPane.showMessageDialog(null, "Computer won.");
						userPile1.remove(userPile1.size()-1); 
						displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
								"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
								"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
								+ "\nComp pile 5: " + compPile5.toString());
					}
					else if (result == 0){
						JOptionPane.showMessageDialog(null, "No winner.");
					}
					else if (result == 1){
						JOptionPane.showMessageDialog(null, "User wins!");
						compPile5.remove(compPile5.size()-1);
						displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
								"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
								"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
								+ "\nComp pile 5: " + compPile5.toString());
					}
					else if (result == 2){
						JOptionPane.showMessageDialog(null, "You win the game!");
						hasWon = true;
						System.exit(0);
					}
					else if (result == -2){
						JOptionPane.showMessageDialog(null, "You lost the game");
						hasLost = true;
						System.exit(0);
					}
					else {
						JOptionPane.showMessageDialog(null, "Both cards lose.");
						compPile5.remove(compPile5.size()-1);
						userPile1.remove(userPile1.size()-1);
						displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
								"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
								"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
								+ "\nComp pile 5: " + compPile5.toString());
					}
					break;
				}
			}
				else if (attackPile == 2){
					switch(pileAttacked){
					case 1:
						result = userPile2.get(userPile2.size()-1).attack(compPile2.get(compPile2.size()-1));
						if (result == -1){
							JOptionPane.showMessageDialog(null, "Computer won.");
							userPile2.remove(userPile2.size()-1); 
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 0){
							JOptionPane.showMessageDialog(null, "No winner.");
						}
						else if (result == 1){
							JOptionPane.showMessageDialog(null, "User wins!");
							compPile1.remove(compPile1.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 2){
							JOptionPane.showMessageDialog(null, "You win the game!");
							hasWon = true;
							System.exit(0);
						}
						else if (result == -2){
							JOptionPane.showMessageDialog(null,"You have lost");
							hasLost = true;
							System.exit(0);
						}
						else {
							JOptionPane.showMessageDialog(null, "Both cards lose.");
							compPile1.remove(compPile1.size()-1);
							userPile2.remove(userPile2.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						break;
					case 2:
						result = userPile2.get(userPile2.size()-1).attack(compPile2.get(compPile2.size()-1));
						if (result == -1){
							JOptionPane.showMessageDialog(null, "Computer won.");
							userPile2.remove(userPile2.size()-1); 
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 0){
							JOptionPane.showMessageDialog(null, "No winner.");
						}
						else if (result == 1){
							JOptionPane.showMessageDialog(null, "User wins!");
							compPile2.remove(compPile2.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 2){
							JOptionPane.showMessageDialog(null, "You win the game!");
							hasWon = true;
							System.exit(0);
						}
						else if (result == -2){
							JOptionPane.showMessageDialog(null, "You have lost");
							hasLost = true;
							System.exit(0);
						}
						else {
							JOptionPane.showMessageDialog(null, "Both cards lose.");
							compPile2.remove(compPile2.size()-1);
							userPile2.remove(userPile2.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						break;
					case 3: 
						result = userPile2.get(userPile2.size()-1).attack(compPile3.get(compPile3.size()-1));
						if (result == -1){
							JOptionPane.showMessageDialog(null, "Computer won.");
							userPile2.remove(userPile2.size()-1); 
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 0){
							JOptionPane.showMessageDialog(null, "No winner.");
						}
						else if (result == 1){
							JOptionPane.showMessageDialog(null, "User wins!");
							compPile3.remove(compPile3.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 2){
							JOptionPane.showMessageDialog(null, "You win the game!");
							hasWon = true;
							System.exit(0);
						}
						else if (result == -2 ){
							JOptionPane.showMessageDialog(null,"You have lost");
							hasLost = true;
							System.exit(0);
						}
						else {
							JOptionPane.showMessageDialog(null, "Both cards lose.");
							compPile3.remove(compPile3.size()-1);
							userPile2.remove(userPile2.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						break;
					case 4:
						result = userPile2.get(userPile2.size()-1).attack(compPile4.get(compPile4.size()-1));
						if (result == -1){
							JOptionPane.showMessageDialog(null, "Computer card won.");
							userPile2.remove(userPile2.size()-1); 
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 0){
							JOptionPane.showMessageDialog(null, "No winner.");
						}
						else if (result == 1){
							JOptionPane.showMessageDialog(null, "User card wins!");
							compPile4.remove(compPile4.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 2){
							JOptionPane.showMessageDialog(null, "You win the game!");
							hasWon = true;
							System.exit(0);
						}
						else if (result == -2){
							JOptionPane.showMessageDialog(null,"You lost the game.");
							hasLost = true;
							System.exit(0);
						}
						else {
							JOptionPane.showMessageDialog(null, "Both cards lose.");
							compPile4.remove(compPile4.size()-1);
							userPile2.remove(userPile2.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						break;
					case 5:
						result = userPile2.get(userPile2.size()-1).attack(compPile5.get(compPile5.size()-1));
						if (result == -1){
							JOptionPane.showMessageDialog(null, "Computer card won.");
							userPile2.remove(userPile2.size()-1); 
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 0){
							JOptionPane.showMessageDialog(null, "No winner.");
						}
						else if (result == 1){
							JOptionPane.showMessageDialog(null, "User card wins!");
							compPile5.remove(compPile5.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 2){
							JOptionPane.showMessageDialog(null, "You win the game!");
							hasWon = true;
							System.exit(0);
						}
						else if (result == -2){
							JOptionPane.showMessageDialog(null,"You lost the game");
							hasLost = true;
							System.exit(0);
						}
						else {
							JOptionPane.showMessageDialog(null, "Both cards lose.");
							compPile5.remove(compPile5.size()-1);
							userPile2.remove(userPile2.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						break;
					}
				}
				else if (attackPile == 3){
					switch(pileAttacked){
					case 1:
						result = userPile3.get(userPile3.size()-1).attack(compPile1.get(compPile1.size()-1));
						if (result == -1){
							JOptionPane.showMessageDialog(null, "Computer card won.");
							userPile3.remove(userPile3.size()-1); 
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 0){
							JOptionPane.showMessageDialog(null, "No winner.");
						}
						else if (result == 1){
							JOptionPane.showMessageDialog(null, "User card wins!");
							compPile1.remove(compPile1.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 2){
							JOptionPane.showMessageDialog(null, "You win the game!");
							hasWon = true;
							System.exit(0);
						}
						else if (result == -2){
							JOptionPane.showMessageDialog(null,"You lost the game");
							hasLost = true;
							System.exit(0);
						}
						else {
							JOptionPane.showMessageDialog(null, "Both cards lose.");
							compPile1.remove(compPile1.size()-1);
							userPile3.remove(userPile3.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						break;
					case 2:
						result = userPile3.get(userPile3.size()-1).attack(compPile2.get(compPile2.size()-1));
						if (result == -1){
							JOptionPane.showMessageDialog(null, "Computer card won.");
							userPile3.remove(userPile3.size()-1); 
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 0){
							JOptionPane.showMessageDialog(null, "No winner.");
						}
						else if (result == 1){
							JOptionPane.showMessageDialog(null, "User card wins!");
							compPile2.remove(compPile2.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 2){
							JOptionPane.showMessageDialog(null, "You win the game!");
							hasWon = true;
							System.exit(0);
						}
						else if (result == -2){
							JOptionPane.showMessageDialog(null,"You lost the game");
							hasLost = true;
							System.exit(0);
						}
						else {
							JOptionPane.showMessageDialog(null, "Both cards lose.");
							compPile2.remove(compPile2.size()-1);
							userPile3.remove(userPile3.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						break;
					case 3: 
						result = userPile3.get(userPile3.size()-1).attack(compPile3.get(compPile3.size()-1));
						if (result == -1){
							JOptionPane.showMessageDialog(null, "Computer card won.");
							userPile3.remove(userPile3.size()-1); 
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 0){
							JOptionPane.showMessageDialog(null, "No winner.");
						}
						else if (result == 1){
							JOptionPane.showMessageDialog(null, "User card wins!");
							compPile3.remove(compPile3.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 2){
							JOptionPane.showMessageDialog(null, "You win the game!");
							hasWon = true;
							System.exit(0);
						}
						else if (result == -2){
							JOptionPane.showMessageDialog(null, "You lost the game!");
							hasLost = true;
							System.exit(0);
						}
						else {
							JOptionPane.showMessageDialog(null, "Both cards lose.");
							compPile3.remove(compPile3.size()-1);
							userPile3.remove(userPile3.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						break;
					case 4:
						result = userPile3.get(userPile3.size()-1).attack(compPile4.get(compPile4.size()-1));
						if (result == -1){
							JOptionPane.showMessageDialog(null, "Computer card won.");
							userPile3.remove(userPile3.size()-1); 
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 0){
							JOptionPane.showMessageDialog(null, "No winner.");
						}
						else if (result == 1){
							JOptionPane.showMessageDialog(null, "User card wins!");
							compPile4.remove(compPile4.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 2){
							JOptionPane.showMessageDialog(null, "You win the game!");
							hasWon = true;
							System.exit(0);
						}
						else if (result == -2){
							JOptionPane.showMessageDialog(null, "You lost the game");
							hasLost = true;
							System.exit(0);
						}
						else {
							JOptionPane.showMessageDialog(null, "Both cards lose.");
							compPile4.remove(compPile4.size()-1);
							userPile3.remove(userPile3.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						break;
					case 5:
						result = userPile3.get(userPile3.size()-1).attack(compPile5.get(compPile5.size()-1));
						if (result == -1){
							JOptionPane.showMessageDialog(null, "Computer won.");
							userPile3.remove(userPile3.size()-1); 
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 0){
							JOptionPane.showMessageDialog(null, "No winner.");
						}
						else if (result == 1){
							JOptionPane.showMessageDialog(null, "User wins!");
							compPile5.remove(compPile5.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 2){
							JOptionPane.showMessageDialog(null, "You win the game!");
							hasWon = true; 
							System.exit(0);
						}
						else if (result == -2){
							JOptionPane.showMessageDialog(null, "You lost the game");
							hasLost = true;
							System.exit(0);
						}
						else {
							JOptionPane.showMessageDialog(null, "Both cards lose.");
							compPile5.remove(compPile5.size()-1);
							userPile3.remove(userPile3.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						break;
					}
				}
				else if (attackPile == 4){
					switch(pileAttacked){
					case 1:
						result = userPile4.get(userPile4.size()-1).attack(compPile1.get(compPile1.size()-1));
						if (result == -1){
							JOptionPane.showMessageDialog(null, "Computer won.");
							userPile4.remove(userPile4.size()-1); 
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 0){
							JOptionPane.showMessageDialog(null, "No winner.");
						}
						else if (result == 1){
							JOptionPane.showMessageDialog(null, "User wins!");
							compPile1.remove(compPile1.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 2){
							JOptionPane.showMessageDialog(null, "You win the game!");
							hasWon = true; 
							System.exit(0);
						}
						else if (result == -2){
							JOptionPane.showMessageDialog(null, "You lost");
							hasLost = true;
							System.exit(0);
						}
						else {
							JOptionPane.showMessageDialog(null, "Both cards lose.");
							compPile1.remove(compPile1.size()-1);
							userPile4.remove(userPile4.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						break;
					case 2:
						result = userPile4.get(userPile4.size()-1).attack(compPile2.get(compPile2.size()-1));
						if (result == -1){
							JOptionPane.showMessageDialog(null, "Computer won.");
							userPile4.remove(userPile4.size()-1); 
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 0){
							JOptionPane.showMessageDialog(null, "No winner.");
						}
						else if (result == 1){
							JOptionPane.showMessageDialog(null, "User wins!");
							compPile2.remove(compPile2.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 2){
							JOptionPane.showMessageDialog(null, "You win the game!");
							hasWon = true;
							System.exit(0);
						}
						else if (result == -2){
							JOptionPane.showMessageDialog(null, "You lost");
							hasLost = true;
							System.exit(0);
						}
						else {
							JOptionPane.showMessageDialog(null, "Both cards lose.");
							compPile2.remove(compPile2.size()-1);
							userPile4.remove(userPile4.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						break;
					case 3: 
						result = userPile4.get(userPile4.size()-1).attack(compPile3.get(compPile3.size()-1));
						if (result == -1){
							JOptionPane.showMessageDialog(null, "Computer won.");
							userPile4.remove(userPile4.size()-1); 
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 0){
							JOptionPane.showMessageDialog(null, "No winner.");
						}
						else if (result == 1){
							JOptionPane.showMessageDialog(null, "User wins!");
							compPile3.remove(compPile3.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 2){
							JOptionPane.showMessageDialog(null, "You win the game!");
							hasWon = true; 
							System.exit(0);
						}
						else if (result == -2){
							JOptionPane.showMessageDialog(null, "You lost");
							hasLost = true;
							System.exit(0);
						}
						else {
							JOptionPane.showMessageDialog(null, "Both cards lose.");
							compPile3.remove(compPile3.size()-1);
							userPile4.remove(userPile4.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						break;
					case 4:
						result = userPile4.get(userPile4.size()-1).attack(compPile4.get(compPile4.size()-1));
						if (result == -1){
							JOptionPane.showMessageDialog(null, "Computer won.");
							userPile4.remove(userPile4.size()-1); 
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 0){
							JOptionPane.showMessageDialog(null, "No winner.");
						}
						else if (result == 1){
							JOptionPane.showMessageDialog(null, "User wins!");
							compPile4.remove(compPile4.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 2){
							JOptionPane.showMessageDialog(null, "You win the game!");
							hasWon = true; 
							System.exit(0);
						}
						else if (result == -2){
							JOptionPane.showMessageDialog(null, "You lost");
							hasLost = true;
							System.exit(0);
						}
						else {
							JOptionPane.showMessageDialog(null, "Both cards lose.");
							compPile4.remove(compPile4.size()-1);
							userPile4.remove(userPile4.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						break;
					case 5:
						result = userPile4.get(userPile4.size()-1).attack(compPile5.get(compPile5.size()-1));
						if (result == -1){
							JOptionPane.showMessageDialog(null, "Computer won.");
							userPile4.remove(userPile4.size()-1); 
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 0){
							JOptionPane.showMessageDialog(null, "No winner.");
						}
						else if (result == 1){
							JOptionPane.showMessageDialog(null, "User wins!");
							compPile5.remove(compPile5.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 2){
							JOptionPane.showMessageDialog(null, "You win the game!");
							hasWon = true;
							System.exit(0);
						}
						else if (result == -2){
							JOptionPane.showMessageDialog(null, "You lost");
							hasLost = true;
							System.exit(0);
						}
						else {
							JOptionPane.showMessageDialog(null, "Both cards lose.");
							compPile5.remove(compPile5.size()-1);
							userPile4.remove(userPile4.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						break;
					}
				}
				else{
					switch(pileAttacked){
					case 1:
						result = userPile5.get(userPile5.size()-1).attack(compPile1.get(compPile1.size()-1));
						if (result == -1){
							JOptionPane.showMessageDialog(null, "Computer won.");
							userPile5.remove(userPile5.size()-1); 
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 0){
							JOptionPane.showMessageDialog(null, "No winner.");
						}
						else if (result == 1){
							JOptionPane.showMessageDialog(null, "User wins!");
							compPile1.remove(compPile1.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 2){
							JOptionPane.showMessageDialog(null, "You win the game!");
							hasWon = true; 
							System.exit(0);
						}
						else if (result == -2){
							JOptionPane.showMessageDialog(null, "You lost");
							hasLost = true;
							System.exit(0);
						}
						else {
							JOptionPane.showMessageDialog(null, "Both cards lose.");
							compPile1.remove(compPile1.size()-1);
							userPile5.remove(userPile5.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						break;
					case 2:
						result = userPile5.get(userPile5.size()-1).attack(compPile2.get(compPile2.size()-1));
						if (result == -1){
							JOptionPane.showMessageDialog(null, "Computer won.");
							userPile5.remove(userPile5.size()-1); 
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 0){
							JOptionPane.showMessageDialog(null, "No winner.");
						}
						else if (result == 1){
							JOptionPane.showMessageDialog(null, "User wins!");
							compPile2.remove(compPile2.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 2){
							JOptionPane.showMessageDialog(null, "You win the game!");
							hasWon = true; 
							System.exit(0);
						}
						else if (result == -2){
							JOptionPane.showMessageDialog(null, "You lost");
							hasLost = true;
							System.exit(0);
						}
						else {
							JOptionPane.showMessageDialog(null, "Both cards lose.");
							compPile2.remove(compPile2.size()-1);
							userPile5.remove(userPile5.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						break;
					case 3: 
						result = userPile5.get(userPile5.size()-1).attack(compPile3.get(compPile3.size()-1));
						if (result == -1){
							JOptionPane.showMessageDialog(null, "Computer won.");
							userPile5.remove(userPile5.size()-1); 
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 0){
							JOptionPane.showMessageDialog(null, "No winner.");
						}
						else if (result == 1){
							JOptionPane.showMessageDialog(null, "User wins!");
							compPile3.remove(compPile3.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 2){
							JOptionPane.showMessageDialog(null, "You win the game!");
							hasWon = true; 
							System.exit(0);
						}
						else if (result == -2){
							JOptionPane.showMessageDialog(null, "You lost");
							hasLost = true;
							System.exit(0);
						}
						else {
							JOptionPane.showMessageDialog(null, "Both cards lose.");
							compPile3.remove(compPile3.size()-1);
							userPile5.remove(userPile5.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						break;
					case 4:
						result = userPile5.get(userPile5.size()-1).attack(compPile4.get(compPile4.size()-1));
						if (result == -1){
							JOptionPane.showMessageDialog(null, "Computer won.");
							userPile5.remove(userPile5.size()-1); 
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 0){
							JOptionPane.showMessageDialog(null, "No winner.");
						}
						else if (result == 1){
							JOptionPane.showMessageDialog(null, "User wins!");
							compPile4.remove(compPile4.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 2){
							JOptionPane.showMessageDialog(null, "You win the game!");
							hasWon = true; 
							System.exit(0);
						}
						else if (result == -2){
							JOptionPane.showMessageDialog(null, "You lost");
							hasLost = true;
							System.exit(0);
						}
						else {
							JOptionPane.showMessageDialog(null, "Both cards lose.");
							compPile4.remove(compPile4.size()-1);
							userPile5.remove(userPile5.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						break;
					case 5:
						result = userPile5.get(userPile5.size()-1).attack(compPile5.get(compPile5.size()-1));
						if (result == -1){
							JOptionPane.showMessageDialog(null, "Computer won.");
							userPile5.remove(userPile5.size()-1); 
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 0){
							JOptionPane.showMessageDialog(null, "No winner.");
						}
						else if (result == 1){
							JOptionPane.showMessageDialog(null, "User wins!");
							compPile5.remove(compPile5.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 2){
							JOptionPane.showMessageDialog(null, "You win the game!");
							hasWon = true;
							System.exit(0);
						}
						else if (result == -2){
							JOptionPane.showMessageDialog(null, "You lost");
							hasLost = true;
							System.exit(0);
						}
						else {
							JOptionPane.showMessageDialog(null, "Both cards lose.");
							compPile5.remove(compPile5.size()-1);
							userPile5.remove(userPile5.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						break;
					}
				}
				int compAttackPile = new Random().nextInt(5);
				int compPileAttacked = new Random().nextInt(5);
				if (compAttackPile == 0){
					switch(compPileAttacked){
					case 0:
						result = compPile1.get(compPile1.size()-1).attack(userPile1.get(userPile1.size()-1));
						JOptionPane.showMessageDialog(null, "Computer pile 1 attacked user pile 1");
						if (result == -1){
							JOptionPane.showMessageDialog(null, "User's card won.");
							compPile1.remove(compPile1.size()-1); 
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 0){
							JOptionPane.showMessageDialog(null, "No winner.");
						}
						else if (result == 1){
							JOptionPane.showMessageDialog(null, "Computer's card wins!");
							userPile1.remove(userPile1.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 2){
							JOptionPane.showMessageDialog(null, "Computer wins the game!");
							hasLost = true;
							System.exit(0);
						}
						else if (result == -2){
							JOptionPane.showMessageDialog(null, "You won the game.");
							hasWon = true;
							System.exit(0);
						}
						else {
							JOptionPane.showMessageDialog(null, "Both cards lose.");
							compPile1.remove(compPile1.size()-1);
							userPile1.remove(userPile1.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						break;
					case 1:
						result = compPile1.get(compPile1.size()-1).attack(userPile2.get(userPile2.size()-1));
						JOptionPane.showMessageDialog(null, "Computer pile 1 attacked user pile 2");
						if (result == -1){
							JOptionPane.showMessageDialog(null, "Your card won.");
							compPile1.remove(compPile1.size()-1); 
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 0){
							JOptionPane.showMessageDialog(null, "No winner.");
						}
						else if (result == 1){
							JOptionPane.showMessageDialog(null, "Computer card wins!");
							userPile2.remove(userPile2.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == -2){
							JOptionPane.showMessageDialog(null, "You have won the game");
							hasWon = true;
							System.exit(0);
						}
						else if (result == 2){
							JOptionPane.showMessageDialog(null, "Computer wins the game!");
							hasLost = true;
							System.exit(0);
						}
						else {
							JOptionPane.showMessageDialog(null, "Both cards lose.");
							userPile2.remove(userPile2.size()-1);
							compPile1.remove(compPile1.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						break;
					case 2: 
						result = compPile1.get(compPile1.size()-1).attack(userPile3.get(userPile3.size()-1));
						JOptionPane.showMessageDialog(null, "Computer pile 1 attacks user pile 3");
						if (result == -1){
							JOptionPane.showMessageDialog(null, "User's card won.");
							compPile1.remove(compPile1.size()-1); 
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 0){
							JOptionPane.showMessageDialog(null, "No winner.");
						}
						else if (result == 1){
							JOptionPane.showMessageDialog(null, "Computer card wins!");
							userPile3.remove(userPile3.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 2){
							JOptionPane.showMessageDialog(null, "Computer wins the game!");
							hasLost = true;
							System.exit(0);
						}
						else if (result == -2){
							JOptionPane.showMessageDialog(null, "User won the game!");
							hasWon = true;
							System.exit(0);
						}
						else {
							JOptionPane.showMessageDialog(null, "Both cards lose.");
							userPile3.remove(userPile3.size()-1);
							compPile1.remove(compPile1.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						break;
					case 3:
						result = compPile1.get(compPile1.size()-1).attack(userPile4.get(userPile4.size()-1));
						JOptionPane.showMessageDialog(null, "Computer pile 1 attacked user pile 4");
						if (result == -1){
							JOptionPane.showMessageDialog(null, "User's Card won.");
							compPile1.remove(compPile1.size()-1); 
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 0){
							JOptionPane.showMessageDialog(null, "No winner.");
						}
						else if (result == 1){
							JOptionPane.showMessageDialog(null, "Computer's card wins!");
							userPile4.remove(userPile4.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 2){
							JOptionPane.showMessageDialog(null, "Computer wins the game!");
							hasLost = true;
							System.exit(0);
						}
						else if (result == -2){
							JOptionPane.showMessageDialog(null, "You won the game");
							hasWon = true;
							System.exit(0);
						}
						else {
							JOptionPane.showMessageDialog(null, "Both cards lose.");
							userPile4.remove(userPile4.size()-1);
							compPile1.remove(compPile1.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						break;
					case 4:
						result = compPile1.get(compPile1.size()-1).attack(userPile5.get(userPile5.size()-1));
						JOptionPane.showMessageDialog(null, "Computer pile 1 attacked user pile 5");
						if (result == -1){
							JOptionPane.showMessageDialog(null, "User card won.");
							compPile1.remove(compPile1.size()-1); 
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 0){
							JOptionPane.showMessageDialog(null, "No winner.");
						}
						else if (result == 1){
							JOptionPane.showMessageDialog(null, "Computer card wins!");
							userPile5.remove(userPile5.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						else if (result == 2){
							JOptionPane.showMessageDialog(null, "Computer wins the game!");
							hasLost = true;
							System.exit(0);
						}
						else if (result == -2){
							JOptionPane.showMessageDialog(null, "You won the game");
							hasWon = true; 
							System.exit(0);
						}
						else {
							JOptionPane.showMessageDialog(null, "Both cards lose.");
							userPile5.remove(userPile5.size()-1);
							compPile1.remove(compPile1.size()-1);
							displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
									"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
									"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
									+ "\nComp pile 5: " + compPile5.toString());
						}
						break;
					}
				}
					else if (compAttackPile == 1){
						switch(compPileAttacked){
						case 0:
							result = compPile2.get(compPile2.size()-1).attack(userPile1.get(userPile1.size()-1));
							JOptionPane.showMessageDialog(null, "Computer pile 2 attacked user pile 1");
							if (result == -1){
								JOptionPane.showMessageDialog(null, "Computer won.");
								userPile2.remove(userPile2.size()-1); 
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							else if (result == 0){
								JOptionPane.showMessageDialog(null, "No winner.");
							}
							else if (result == 1){
								JOptionPane.showMessageDialog(null, "User wins!");
								compPile1.remove(compPile1.size()-1);
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							else if (result == 2){
								JOptionPane.showMessageDialog(null, "You lose the game!");
								hasLost = true;
								System.exit(0);
							}
							else if (result == -2){
								JOptionPane.showMessageDialog(null,"You have won the game");
								hasWon = true;
								System.exit(0);
							}
							else {
								JOptionPane.showMessageDialog(null, "Both cards lose.");
								userPile1.remove(userPile1.size()-1);
								compPile2.remove(userPile2.size()-1);
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							break;
						case 1:
							result = compPile2.get(compPile2.size()-1).attack(userPile2.get(userPile2.size()-1));
							JOptionPane.showMessageDialog(null, "Computer pile 2 attacked user pile 2");
							if (result == -1){
								JOptionPane.showMessageDialog(null, "Your card won.");
								compPile2.remove(compPile2.size()-1); 
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							else if (result == 0){
								JOptionPane.showMessageDialog(null, "No winner.");
							}
							else if (result == 1){
								JOptionPane.showMessageDialog(null, "Computer card wins!");
								userPile2.remove(userPile2.size()-1);
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							else if (result == 2){
								JOptionPane.showMessageDialog(null, "You lost the game!");
								hasLost = true;
								System.exit(0);
							}
							else if (result == -2){
								JOptionPane.showMessageDialog(null, "You have won the game!");
								hasWon = true;
								System.exit(0);
							}
							else {
								JOptionPane.showMessageDialog(null, "Both cards lose.");
								compPile2.remove(compPile2.size()-1);
								userPile2.remove(userPile2.size()-1);
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							break;
						case 2: 
							result = compPile2.get(compPile2.size()-1).attack(userPile3.get(userPile3.size()-1));
							JOptionPane.showMessageDialog(null, "Computer pile 2 attacked user pile 3");
							if (result == -1){
								JOptionPane.showMessageDialog(null, "Your card won.");
								compPile2.remove(compPile2.size()-1); 
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							else if (result == 0){
								JOptionPane.showMessageDialog(null, "No winner.");
							}
							else if (result == 1){
								JOptionPane.showMessageDialog(null, "Computer card wins!");
								userPile3.remove(userPile3.size()-1);
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							else if (result == 2){
								JOptionPane.showMessageDialog(null, "You lost the game!");
								hasLost = true;
								System.exit(0);
							}
							else if (result == -2 ){
								JOptionPane.showMessageDialog(null,"You have won the game!");
								hasWon = true;
								System.exit(0);
							}
							else {
								JOptionPane.showMessageDialog(null, "Both cards lose.");
								userPile3.remove(userPile3.size()-1);
								compPile2.remove(compPile2.size()-1);
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							break;
						case 3:
							result = compPile2.get(compPile2.size()-1).attack(userPile4.get(userPile4.size()-1));
							JOptionPane.showMessageDialog(null, "Computer pile 2 attacked user pile 4");
							if (result == -1){
								JOptionPane.showMessageDialog(null, "Your card won.");
								compPile2.remove(compPile2.size()-1); 
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							else if (result == 0){
								JOptionPane.showMessageDialog(null, "No winner.");
							}
							else if (result == 1){
								JOptionPane.showMessageDialog(null, "Computer card wins!");
								userPile4.remove(userPile4.size()-1);
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							else if (result == 2){
								JOptionPane.showMessageDialog(null, "You lost the game!");
								hasLost = true;
								System.exit(0);
							}
							else if (result == -2){
								JOptionPane.showMessageDialog(null,"You won the game.");
								hasWon = true; 
								System.exit(0);
							}
							else {
								JOptionPane.showMessageDialog(null, "Both cards lose.");
								userPile4.remove(userPile4.size()-1);
								compPile2.remove(compPile2.size()-1);
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							break;
						case 4:
							result = compPile2.get(compPile2.size()-1).attack(userPile5.get(userPile5.size()-1));
							JOptionPane.showMessageDialog(null, "Computer pile 2 attacked user pile 5");
							if (result == -1){
								JOptionPane.showMessageDialog(null, "Your card won.");
								compPile2.remove(compPile2.size()-1); 
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							else if (result == 0){
								JOptionPane.showMessageDialog(null, "No winner.");
							}
							else if (result == 1){
								JOptionPane.showMessageDialog(null, "Computer card wins!");
								userPile5.remove(userPile5.size()-1);
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							else if (result == 2){
								JOptionPane.showMessageDialog(null, "You lost the game!");
								hasLost = true;
								System.exit(0);
							}
							else if (result == -2){
								JOptionPane.showMessageDialog(null,"You won the game!");
								hasWon = true;
								System.exit(0);
							}
							else {
								JOptionPane.showMessageDialog(null, "Both cards lose.");
								userPile5.remove(userPile5.size()-1);
								compPile2.remove(compPile2.size()-1);
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							break;
						}
					}
					else if (compAttackPile == 2){
						switch(compPileAttacked){
						case 0:
							result = compPile3.get(compPile3.size()-1).attack(userPile1.get(userPile1.size()-1));
							JOptionPane.showMessageDialog(null, "Computer pile 3 attacked user pile 1");
							if (result == -1){
								JOptionPane.showMessageDialog(null, "Your card won.");
								compPile3.remove(compPile3.size()-1); 
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							else if (result == 0){
								JOptionPane.showMessageDialog(null, "No winner.");
							}
							else if (result == 1){
								JOptionPane.showMessageDialog(null, "Computer card wins!");
								userPile1.remove(userPile1.size()-1);
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							else if (result == 2){
								JOptionPane.showMessageDialog(null, "You lost the game!");
								hasLost = true;
								System.exit(0);
							}
							else if (result == -2){
								JOptionPane.showMessageDialog(null,"You won the game");
								hasWon = true;
								System.exit(0);
							}
							else {
								JOptionPane.showMessageDialog(null, "Both cards lose.");
								compPile1.remove(compPile1.size()-1);
								userPile3.remove(userPile3.size()-1);
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							break;
						case 1:
							result = compPile3.get(compPile3.size()-1).attack(userPile2.get(userPile2.size()-1));
							JOptionPane.showMessageDialog(null, "Computer pile 3 attacked user pile 2");
							if (result == -1){
								JOptionPane.showMessageDialog(null, "Your card won.");
								compPile3.remove(compPile3.size()-1); 
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							else if (result == 0){
								JOptionPane.showMessageDialog(null, "No winner.");
							}
							else if (result == 1){
								JOptionPane.showMessageDialog(null, "Computer card wins!");
								userPile2.remove(userPile2.size()-1);
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							else if (result == 2){
								JOptionPane.showMessageDialog(null, "You lost the game!");
								hasLost = true;
								System.exit(0);
							}
							else if (result == -2){
								JOptionPane.showMessageDialog(null,"You won the game!");
								hasWon = true;
								System.exit(0);
							}
							else {
								JOptionPane.showMessageDialog(null, "Both cards lose.");
								userPile2.remove(userPile2.size()-1);
								compPile3.remove(compPile3.size()-1);
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							break;
						case 2: 
							result = compPile3.get(compPile3.size()-1).attack(userPile3.get(userPile3.size()-1));
							JOptionPane.showMessageDialog(null, "Computer pile 3 attacked user pile 3");
							if (result == -1){
								JOptionPane.showMessageDialog(null, "Your card won.");
								compPile3.remove(compPile3.size()-1); 
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							else if (result == 0){
								JOptionPane.showMessageDialog(null, "No winner.");
							}
							else if (result == 1){
								JOptionPane.showMessageDialog(null, "Computer card wins!");
								userPile3.remove(userPile3.size()-1);
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							else if (result == 2){
								JOptionPane.showMessageDialog(null, "You lost the game!");
								hasLost = true;
								System.exit(0);
							}
							else if (result == -2){
								JOptionPane.showMessageDialog(null, "You won the game!");
								hasWon = true;
								System.exit(0);
							}
							else {
								JOptionPane.showMessageDialog(null, "Both cards lose.");
								compPile3.remove(compPile3.size()-1);
								userPile3.remove(userPile3.size()-1);
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							break;
						case 3:
							result = compPile3.get(compPile3.size()-1).attack(userPile4.get(userPile4.size()-1));
							JOptionPane.showMessageDialog(null, "Computer pile 3 attacked user pile 4");
							if (result == -1){
								JOptionPane.showMessageDialog(null, "Your card won.");
								compPile3.remove(compPile3.size()-1); 
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							else if (result == 0){
								JOptionPane.showMessageDialog(null, "No winner.");
							}
							else if (result == 1){
								JOptionPane.showMessageDialog(null, "Computer card wins!");
								userPile4.remove(userPile4.size()-1);
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							else if (result == 2){
								JOptionPane.showMessageDialog(null, "You lost the game!");
								hasLost = true;
								System.exit(0);
							}
							else if (result == -2){
								JOptionPane.showMessageDialog(null, "You won the game!");
								hasWon = true;
								System.exit(0);
							}
							else {
								JOptionPane.showMessageDialog(null, "Both cards lose.");
								userPile4.remove(userPile4.size()-1);
								compPile3.remove(compPile3.size()-1);
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							break;
						case 4:
							result = compPile3.get(compPile3.size()-1).attack(userPile5.get(userPile5.size()-1));
							JOptionPane.showMessageDialog(null, "Computer pile 3 attacked user pile 5");
							if (result == -1){
								JOptionPane.showMessageDialog(null, "Computer won.");
								userPile3.remove(userPile3.size()-1); 
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							else if (result == 0){
								JOptionPane.showMessageDialog(null, "No winner.");
							}
							else if (result == 1){
								JOptionPane.showMessageDialog(null, "Computer card wins!");
								userPile5.remove(userPile5.size()-1);
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							else if (result == 2){
								JOptionPane.showMessageDialog(null, "You lost the game!");
								hasLost = true;
								System.exit(0);
							}
							else if (result == -2){
								JOptionPane.showMessageDialog(null, "You won the game!");
								hasWon = true;
								System.exit(0);
							}
							else {
								JOptionPane.showMessageDialog(null, "Both cards lose.");
								userPile5.remove(userPile5.size()-1);
								compPile3.remove(compPile3.size()-1);
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							break;
						}
					}
					else if (compAttackPile == 3){
						switch(compPileAttacked){
						case 0:
							result = compPile4.get(compPile4.size()-1).attack(userPile1.get(userPile1.size()-1));
							JOptionPane.showMessageDialog(null, "Computer pile 4 attacked user pile 1");
							if (result == -1){
								JOptionPane.showMessageDialog(null, "User card won.");
								compPile4.remove(compPile4.size()-1); 
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							else if (result == 0){
								JOptionPane.showMessageDialog(null, "No winner.");
							}
							else if (result == 1){
								JOptionPane.showMessageDialog(null, "Computer card wins!");
								userPile1.remove(userPile1.size()-1);
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							else if (result == 2){
								JOptionPane.showMessageDialog(null, "You lost the game!");
								hasLost = true;
								System.exit(0);
							}
							else if (result == -2){
								JOptionPane.showMessageDialog(null, "You won the game!");
								hasWon = true;
								System.exit(0);
							}
							else {
								JOptionPane.showMessageDialog(null, "Both cards lose.");
								userPile1.remove(userPile1.size()-1);
								compPile4.remove(compPile4.size()-1);
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							break;
						case 1:
							result = compPile4.get(compPile4.size()-1).attack(userPile2.get(userPile2.size()-1));
							JOptionPane.showMessageDialog(null, "Computer pile 4 attacked user pile 2");
							if (result == -1){
								JOptionPane.showMessageDialog(null, "User card won.");
								compPile4.remove(compPile4.size()-1); 
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							else if (result == 0){
								JOptionPane.showMessageDialog(null, "No winner.");
							}
							else if (result == 1){
								JOptionPane.showMessageDialog(null, "Computer card wins!");
								userPile2.remove(userPile2.size()-1);
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							else if (result == 2){
								JOptionPane.showMessageDialog(null, "You lost the game!");
								hasLost = true;
								System.exit(0);
							}
							else if (result == -2){
								JOptionPane.showMessageDialog(null, "You won the game!");
								hasWon = true;
								System.exit(0);
							}
							else {
								JOptionPane.showMessageDialog(null, "Both cards lose.");
								userPile2.remove(userPile2.size()-1);
								compPile4.remove(compPile4.size()-1);
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							break;
						case 2: 
							result = compPile4.get(userPile4.size()-1).attack(compPile3.get(compPile3.size()-1));
							JOptionPane.showMessageDialog(null, "Computer pile 4 attacked user pile 3");
							if (result == -1){
								JOptionPane.showMessageDialog(null, "User card won.");
								compPile4.remove(compPile4.size()-1); 
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							else if (result == 0){
								JOptionPane.showMessageDialog(null, "No winner.");
							}
							else if (result == 1){
								JOptionPane.showMessageDialog(null, "Computer card wins!");
								userPile3.remove(userPile3.size()-1);
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							else if (result == 2){
								JOptionPane.showMessageDialog(null, "You lost the game!");
								hasLost = true;
								System.exit(0);
							}
							else if (result == -2){
								JOptionPane.showMessageDialog(null, "You win the game!");
								hasWon = true;
								System.exit(0);
							}
							else {
								JOptionPane.showMessageDialog(null, "Both cards lose.");
								userPile3.remove(userPile3.size()-1);
								compPile4.remove(compPile4.size()-1);
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							break;
						case 3:
							result = compPile4.get(compPile4.size()-1).attack(userPile4.get(userPile4.size()-1));
							JOptionPane.showMessageDialog(null, "Computer pile 4 attacked user pile 4");
							if (result == -1){
								JOptionPane.showMessageDialog(null, "User card won.");
								compPile4.remove(compPile4.size()-1); 
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							else if (result == 0){
								JOptionPane.showMessageDialog(null, "No winner.");
							}
							else if (result == 1){
								JOptionPane.showMessageDialog(null, "Computer pile wins!");
								userPile4.remove(userPile4.size()-1);
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							else if (result == 2){
								JOptionPane.showMessageDialog(null, "You lost the game!");
								hasLost = true;
								System.exit(0);
							}
							else if (result == -2){
								JOptionPane.showMessageDialog(null, "You won the game!");
								hasWon = true;
								System.exit(0);
							}
							else {
								JOptionPane.showMessageDialog(null, "Both cards lose.");
								compPile4.remove(compPile4.size()-1);
								userPile4.remove(userPile4.size()-1);
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							break;
						case 4:
							result = compPile4.get(compPile4.size()-1).attack(userPile5.get(userPile5.size()-1));
							JOptionPane.showMessageDialog(null, "Computer pile 4 attacked user pile 5");
							if (result == -1){
								JOptionPane.showMessageDialog(null, "User card won.");
								compPile4.remove(compPile4.size()-1); 
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							else if (result == 0){
								JOptionPane.showMessageDialog(null, "No winner.");
							}
							else if (result == 1){
								JOptionPane.showMessageDialog(null, "Computer card wins!");
								userPile5.remove(userPile5.size()-1);
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							else if (result == 2){
								JOptionPane.showMessageDialog(null, "You lost the game!");
								hasLost = true;
								System.exit(0);
							}
							else if (result == -2){
								JOptionPane.showMessageDialog(null, "You won the game!");
								hasWon = true;
								System.exit(0);
							}
							else {
								JOptionPane.showMessageDialog(null, "Both cards lose.");
								userPile5.remove(userPile5.size()-1);
								compPile4.remove(compPile4.size()-1);
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							break;
						}
					}
					else{
						switch(compPileAttacked){
						case 0:
							result = compPile5.get(compPile5.size()-1).attack(userPile1.get(userPile1.size()-1));
							JOptionPane.showMessageDialog(null, "Computer pile 5 attacked user pile 1");
							if (result == -1){
								JOptionPane.showMessageDialog(null, "Computer won.");
								compPile5.remove(compPile5.size()-1); 
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							else if (result == 0){
								JOptionPane.showMessageDialog(null, "No winner.");
							}
							else if (result == 1){
								JOptionPane.showMessageDialog(null, "Computer card wins!");
								userPile1.remove(userPile1.size()-1);
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							else if (result == 2){
								JOptionPane.showMessageDialog(null, "You lost the game!");
								hasLost = true;
								System.exit(0);
							}
							else if (result == -2){
								JOptionPane.showMessageDialog(null, "You won the game!");
								hasWon = true;
								System.exit(0);
							}
							else {
								JOptionPane.showMessageDialog(null, "Both cards lose.");
								userPile1.remove(userPile1.size()-1);
								compPile5.remove(compPile5.size()-1);
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							break;
						case 1:
							result = compPile5.get(compPile5.size()-1).attack(userPile2.get(userPile2.size()-1));
							JOptionPane.showMessageDialog(null, "Computer pile 5 attacked user pile 2");
							if (result == -1){
								JOptionPane.showMessageDialog(null, "User card won.");
								compPile5.remove(compPile5.size()-1); 
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							else if (result == 0){
								JOptionPane.showMessageDialog(null, "No winner.");
							}
							else if (result == 1){
								JOptionPane.showMessageDialog(null, "Computer card wins!");
								userPile2.remove(userPile2.size()-1);
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							else if (result == 2){
								JOptionPane.showMessageDialog(null, "You lost the game!");
								hasLost = true;
								System.exit(0);
							}
							else if (result == -2){
								JOptionPane.showMessageDialog(null, "You won the game!");
								hasWon = true;
								System.exit(0);
							}
							else {
								JOptionPane.showMessageDialog(null, "Both cards lose.");
								userPile2.remove(userPile2.size()-1);
								compPile5.remove(compPile5.size()-1);
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							break;
						case 2: 
							result = compPile5.get(compPile5.size()-1).attack(userPile3.get(userPile3.size()-1));
							JOptionPane.showMessageDialog(null, "Computer pile 5 attacked user pile 3");
							if (result == -1){
								JOptionPane.showMessageDialog(null, "User card won.");
								compPile5.remove(compPile5.size()-1); 
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							else if (result == 0){
								JOptionPane.showMessageDialog(null, "No winner.");
							}
							else if (result == 1){
								JOptionPane.showMessageDialog(null, "Computer card wins!");
								userPile3.remove(userPile3.size()-1);
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							else if (result == 2){
								JOptionPane.showMessageDialog(null, "You lost the game!");
								hasLost = true;
								System.exit(0);
							}
							else if (result == -2){
								JOptionPane.showMessageDialog(null, "You won the game!");
								hasWon = true;
								System.exit(0);
							}
							else {
								JOptionPane.showMessageDialog(null, "Both cards lose.");
								userPile3.remove(userPile3.size()-1);
								compPile5.remove(compPile5.size()-1);
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							break;
						case 3:
							result = compPile5.get(compPile5.size()-1).attack(userPile4.get(userPile4.size()-1));
							JOptionPane.showMessageDialog(null, "Computer pile 5 attacked user pile 4");
							if (result == -1){
								JOptionPane.showMessageDialog(null, "User card won.");
								compPile5.remove(compPile5.size()-1); 
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							else if (result == 0){
								JOptionPane.showMessageDialog(null, "No winner.");
							}
							else if (result == 1){
								JOptionPane.showMessageDialog(null, "Computer card wins!");
								userPile4.remove(userPile4.size()-1);
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							else if (result == 2){
								JOptionPane.showMessageDialog(null, "You lost the game!");
								hasLost = true;
								System.exit(0);
							}
							else if (result == -2){
								JOptionPane.showMessageDialog(null, "You won the game!");
								hasWon = true;
								System.exit(0);
							}
							else {
								JOptionPane.showMessageDialog(null, "Both cards lose.");
								userPile4.remove(userPile4.size()-1);
								compPile5.remove(compPile5.size()-1);
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							break;
						case 4:
							result = compPile5.get(compPile5.size()-1).attack(userPile5.get(userPile5.size()-1));
							if (result == -1){
								JOptionPane.showMessageDialog(null, "User card won.");
								compPile5.remove(compPile5.size()-1); 
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							else if (result == 0){
								JOptionPane.showMessageDialog(null, "No winner.");
							}
							else if (result == 1){
								JOptionPane.showMessageDialog(null, "Computer card wins!");
								userPile5.remove(compPile5.size()-1);
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							else if (result == 2){
								JOptionPane.showMessageDialog(null, "You lost the game!");
								hasLost = true;
								System.exit(0);
							}
							else if (result == -2){
								JOptionPane.showMessageDialog(null, "You won the game!");
								hasWon = true;
								System.exit(0);
							}
							else {
								JOptionPane.showMessageDialog(null, "Both cards lose.");
								compPile5.remove(compPile5.size()-1);
								userPile5.remove(userPile5.size()-1);
								displayCards.setText("User Pile 1: " + userPile1.toString() + "\nUser Pile 2: " + userPile2.toString() + "\nUser Pile 3 : " + userPile3.toString() +
										"\nUser Pile 4: " + userPile4.toString() + "\nUser Pile 5: " + userPile5.toString() + "\n\nComp pile 1: " + compPile1.toString() +
										"\nComp pile 2: " + compPile2.toString() + "\nComp pile 3: " + compPile3.toString() + "\nComp pile 4: " + compPile4.toString()
										+ "\nComp pile 5: " + compPile5.toString());
							}
							break;
						}
					}
			} 
			
		}
	}
}



