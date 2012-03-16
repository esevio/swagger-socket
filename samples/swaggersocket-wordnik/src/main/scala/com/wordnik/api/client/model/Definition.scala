/**
 *  Copyright 2012 Wordnik, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
 
package com.wordnik.api.client.model

import com.wordnik.swagger.runtime.annotations._

import scala.reflect.BeanProperty

import scala.collection.JavaConversions._

import scala.collection.mutable.ListBuffer


/**
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 * @author tony
 *
 */
class Definition extends Object {

	/**
	 * 
	 * 
	 * 
	 */
    @BeanProperty
    var extendedText:String =_

	/**
	 * 
	 * 
	 * 
	 */
    @BeanProperty
    var text:String =_

	/**
	 * 
	 * 
	 * 
	 */
    @BeanProperty
    var sourceDictionary:String =_

	/**
	 * 
	 * 
	 * 
	 */
	var citations  =  new ListBuffer[Citation]
	def getCitations:java.util.List[com.wordnik.api.client.model.Citation] = {
	    citations.toList
	}
	def setCitations(args:java.util.List[com.wordnik.api.client.model.Citation]) = {
	    citations.clear
	    args.foreach(arg=>citations += arg)
	}

	/**
	 * 
	 * 
	 * 
	 */
	var labels  =  new ListBuffer[Label]
	def getLabels:java.util.List[com.wordnik.api.client.model.Label] = {
	    labels.toList
	}
	def setLabels(args:java.util.List[com.wordnik.api.client.model.Label]) = {
	    labels.clear
	    args.foreach(arg=>labels += arg)
	}

	/**
	 * 
	 * 
	 * 
	 */
    @BeanProperty
    var score:Float =_

	/**
	 * 
	 * 
	 * 
	 */
	var exampleUses  =  new ListBuffer[ExampleUsage]
	def getExampleUses:java.util.List[com.wordnik.api.client.model.ExampleUsage] = {
	    exampleUses.toList
	}
	def setExampleUses(args:java.util.List[com.wordnik.api.client.model.ExampleUsage]) = {
	    exampleUses.clear
	    args.foreach(arg=>exampleUses += arg)
	}

	/**
	 * 
	 * 
	 * 
	 */
    @BeanProperty
    var attributionUrl:String =_

	/**
	 * 
	 * 
	 * 
	 */
    @BeanProperty
    var seqString:String =_

	/**
	 * 
	 * 
	 * 
	 */
    @BeanProperty
    var attributionText:String =_

	/**
	 * 
	 * 
	 * 
	 */
	var relatedWords  =  new ListBuffer[Related]
	def getRelatedWords:java.util.List[com.wordnik.api.client.model.Related] = {
	    relatedWords.toList
	}
	def setRelatedWords(args:java.util.List[com.wordnik.api.client.model.Related]) = {
	    relatedWords.clear
	    args.foreach(arg=>relatedWords += arg)
	}

	/**
	 * 
	 * 
	 * 
	 */
    @BeanProperty
    var sequence:String =_

	/**
	 * 
	 * 
	 * 
	 */
    @BeanProperty
    var word:String =_

	/**
	 * 
	 * 
	 * 
	 */
	var notes  =  new ListBuffer[Note]
	def getNotes:java.util.List[com.wordnik.api.client.model.Note] = {
	    notes.toList
	}
	def setNotes(args:java.util.List[com.wordnik.api.client.model.Note]) = {
	    notes.clear
	    args.foreach(arg=>notes += arg)
	}

	/**
	 * 
	 * 
	 * 
	 */
	var textProns  =  new ListBuffer[TextPron]
	def getTextProns:java.util.List[com.wordnik.api.client.model.TextPron] = {
	    textProns.toList
	}
	def setTextProns(args:java.util.List[com.wordnik.api.client.model.TextPron]) = {
	    textProns.clear
	    args.foreach(arg=>textProns += arg)
	}

	/**
	 * 
	 * 
	 * 
	 */
    @BeanProperty
    var partOfSpeech:String =_

    override def toString:String = {
        "[" +
        "extendedText:" + extendedText + 
            "text:" + text + 
            "sourceDictionary:" + sourceDictionary + 
            "citations:" + citations + 
            "labels:" + labels + 
            "score:" + score + 
            "exampleUses:" + exampleUses + 
            "attributionUrl:" + attributionUrl + 
            "seqString:" + seqString + 
            "attributionText:" + attributionText + 
            "relatedWords:" + relatedWords + 
            "sequence:" + sequence + 
            "word:" + word + 
            "notes:" + notes + 
            "textProns:" + textProns + 
            "partOfSpeech:" + partOfSpeech + "]"
    }
}