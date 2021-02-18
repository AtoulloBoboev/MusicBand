package com.codewithatoullo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Создать класс Музыкальная Группа (англ. MusicBand) с полями name и year (название музыкальной группы и год основания).
 * Создать 10 или более экземпляров класса MusicBand, добавить их в список.
 * Перемешать список. Создать второй список, в которой скопировать группы из первого списка,
 * основанные после 2000 года. Вывести в консоль оба списка.
 *
 * Примечание: выбирайте такие музыкальныке группы, которые были созданы как до 2000 года, так и после, жанр не важен.
 */

public class Main {

    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Queen", 1970);
        MusicBand band2 = new MusicBand("The Beatles", 1960);
        MusicBand band3 = new MusicBand("The Rolling Stones", 1962);
        MusicBand band4 = new MusicBand("Pink Floyd", 1982);
        MusicBand band5 = new MusicBand("The Beach Boys", 1995);
        MusicBand band6 = new MusicBand("The Doors", 2002);
        MusicBand band7 = new MusicBand("Nirvana", 1994);
        MusicBand band8 = new MusicBand("The Who", 2001);
        MusicBand band9 = new MusicBand("U2", 2005);
        MusicBand band10 = new MusicBand("Led Zeppelin", 1993);


        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(band1);
        musicBands.add(band2);
        musicBands.add(band3);
        musicBands.add(band4);
        musicBands.add(band5);
        musicBands.add(band6);
        musicBands.add(band7);
        musicBands.add(band8);
        musicBands.add(band9);
        musicBands.add(band10);

        System.out.println(musicBands);

        //Перемешать список
        Collections.shuffle(musicBands);

        System.out.println(musicBands);

    //Создать второй список, в которой скопировать группы из первого списка, основанные после 2000 года. Вывести в консоль оба списка.
        List<MusicBand> musicBandsAfter2000 = new ArrayList<>();
        for (MusicBand band: musicBands){
            if (band.getYear()>2000){
                musicBandsAfter2000.add(band);
            }
        }
        System.out.println(musicBandsAfter2000);
    }
}
