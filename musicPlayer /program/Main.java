package musicPlayer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {
    public static void main(String[] args) {

        // How to play AUDIO with Java (.wav, .au, .aiff, etc...)
        String filePath = "musicPlayer /audio/Weit Weg (feat. DomX).wav"; // convert the existing audio file
                                                                          // to "wav" and reupload
        File file = new File(filePath);

        try (Scanner scanner = new Scanner(System.in);
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String playAudio;
            System.out.println();
            System.out.print("Do you want to play the audio file? (y/n): ");
            playAudio = scanner.next();

            if (playAudio.toLowerCase().equals("y")) {
                System.out.println();
                System.out.println("Opening music player...");
                System.out.println();
            }

            else {
                System.out.print("Exiting...");
            }

            String response = "";

            while (playAudio.toLowerCase().equals("y") && !response.toUpperCase().equals("Q")) {
                System.out.println();
                System.out.println("----Music Player Control----");
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Enter your choice: ");

                response = scanner.next().toUpperCase();

                switch (response) {
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice!");
                }
            }

        }

        catch (FileNotFoundException e) {
            System.out.println();
            System.out.println("Could not locate file!");
            System.out.println();
        }

        catch (UnsupportedAudioFileException e) {
            System.out.println();
            System.out.println("Audio file is not supported!");
            System.out.println();
        }

        catch (LineUnavailableException e) {
            System.out.println();
            System.out.println("Unable to access audio resource!");
            System.out.println();
        }

        catch (IOException e) {
            System.out.println();
            System.out.println("Something went wrong!");
            System.out.println();
        }

        finally {
            System.out.println();
            System.out.println("Bye...");
            System.out.println();
        }
    }

}
