package com.tactfactory.designpatternniveau1.adapter.tp1;

import com.tactfactory.designpatternniveau1.adapter.tp1.model.*;

/**
*
* @author tactfactory
*
* - Sans modifier le point d'entré de l'application mettre en place un design pattern "Adapter" afin d'avoir les
*   éléments suivant :
*   - 1 : Un AudioPlayer est par défaut seulement capable de jouer des fichiers .mp3 avec ça fonction play()
*   - 2 : Un Mp4Player doit être capable de jouer des fichiers .mp4
*   - 3 : Un VlcPlayer doit être capable de jouer des fichiers .vlc
*   - 4 : En modifiant la fonction play() dans AudioPlayer permettre, grâce à un design pattern Adapter, de lire des
*       fichiers .mp4 et .vlc en plus des fichiers .mp3
*   - 5 : On peut utiliser un design pattern "Factory" afin de récupérer le bon type de player, Mp4Player ou VlcPlayer,
*       pour notre AudioPlayer
*   - 6 : Le lancement de l'application doit afficher les éléments suivant :
*
*       Playing mp3 file. Name: beyond the horizon.mp3
*       Playing mp4 file. Name: alone.mp4
*       Playing vlc file. Name: far far away.vlc
*       Invalid media. avi format not supported
*       Playing mp4 file. Name: test.mp4
*       Playing mp4 file. Name: test1.mp4
*/
public class AdapterTp1 {
  public static void main(String[] args) {
    AudioPlayer audioPlayer = new AudioPlayer();

    audioPlayer.play("mp3", "beyond the horizon.mp3");
    audioPlayer.play("mp4", "alone.mp4");
    audioPlayer.play("vlc", "far far away.vlc");
    audioPlayer.play("avi", "mind me.avi");

    MediaPlayer player = new MediaAdapter("mp4");
    player.play("mp4", "test.mp4");

    MediaPlayer player1 = new AudioPlayer();
    player1.play("mp4", "test1.mp4");
  }
}
