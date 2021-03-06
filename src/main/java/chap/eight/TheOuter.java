/*
 * FILENAME
 *     TheOuter.java
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

package chap.eight;

/**
 * <p>
 * The class for purpose of.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public class TheOuter
{
    {
        class InnerInitialBlock {
            
        }
    }
    
    interface TheInner {
        int x = 6;
        
        public Integer toX();
    }
    
    void foo() {
        class InnerFoo {
            int t;
        }
        
        InnerFoo innerFoo = new InnerFoo();
        innerFoo.t = 2;
        
        class TheInnerImpl implements TheInner {

            /**
             * {@inheritDoc}
             *
             * @see chap.eight.TheOuter.TheInner#toX()
             */
            @Override
            public Integer toX()
            {
                return TheInner.x;
            }
            
        }
    }
}
