/*
 * FILENAME
 *     PlayList.java
 *
 * FILE LOCATION
 *     $Source$
 *
 * VERSION
 *     $Id$
 *         @version       $Revision$
 *         Check-Out Tag: $Name$
 *         Locked By:     $Lockers$
 *
 * FORMATTING NOTES
 *     * Lines should be limited to 78 characters.
 *     * Files should contain no tabs.
 *     * Indent code using four-character increments.
 *
 * COPYRIGHT
 *     Copyright (C) 2005 vietsoftware international Inc. All rights reserved.
 *     This software is the confidential and proprietary information of
 *     VSII ("Confidential Information"). You shall not
 *     disclose such Confidential Information and shall use it only in
 *     accordance with the terms of the license agreement you entered into
 *     with VSII.
 */

package chap.one;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * <p>
 * The class for purpose of.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public class PlayList
{

    public static void main(String[] args)
    {
        List<String> playList = new LinkedList<String>();

        playList.add("Rock With You - 1979");
        playList.add("Billie Jean - 1983");
        playList.add("Man In the Mirror - 1988");
        playList.add("Black Or White - 1991");
        playList.add("This is it - 2010");

        System.out.println("The original playlist of MJ's songs");
        System.out.println(playList);
/*
        System.out.println("\nThe reversed playlist");
        Collections.reverse(playList);
        System.out.println(playList);

        System.out.println("\nNow after shuffling the playlist");
        Collections.shuffle(playList);
        System.out.println(playList);
*/
        System.out.println("\nSort the songs by their names ");
        Collections.sort(playList);
        System.out.println(playList);
/*
        System.out.println("\nIs my most favourite song Black Or White - 1991 present in the list?");
        String backOrWhiteSong = "Black Or White - 1991";
        int index = Collections.binarySearch(playList, backOrWhiteSong);

        if (index >= 0)
        {
            System.out.printf("Yes, its the %d song \n", (index + 1));
        }
        else
        {
            System.out.printf("No, its not there in the playlist \n");
        }
        */
        System.out.println("\nLet me forward by two songs (rotate the list) ");
        Collections.rotate(playList, 1);
        System.out.println(playList);
    }

}
