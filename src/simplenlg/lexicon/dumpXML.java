/*
 * The contents of this file are subject to the Mozilla Public License
 * Version 1.1 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * The Original Code is "Simplenlg".
 *
 * The Initial Developer of the Original Code is Ehud Reiter, Albert Gatt and Dave Westwater.
 * Portions created by Ehud Reiter, Albert Gatt and Dave Westwater are Copyright (C) 2010-11 The University of Aberdeen. All Rights Reserved.
 *
 * Contributor(s): Ehud Reiter, Albert Gatt, Dave Wewstwater, Roman Kutlak, Margaret Mitchell.
 */
package simplenlg.lexicon;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.LineNumberReader;

import java.util.Properties;

import simplenlg.framework.LexicalCategory;
import simplenlg.framework.WordElement;

// this class reads in a word list, looks up the words in the NIH lexicon,
// and writes the XML words into an output file
public class dumpXML {
	
	// filenames
	static final String DB_FILENAME = "E:\\NIHDB\\lexAccess2009";  // DB location
	static final String WORDLIST_FILENAME = "E:\\NIHDB\\wordlist.csv";  // word list
	static final String XML_FILENAME = "E:\\NIHDB\\default-lexicon.xml";  // word list
}
