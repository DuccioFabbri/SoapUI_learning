package com.vogella.groovy.first


import groovy.sql.Sql
import java.sql.DriverManager

import com.eviware.soapui.support.GroovyUtils

class DBConnection {
	def log
	def context
	def testRunner
	
	def DBConnection()
	{
		com.eviware.soapui.support.GroovyUtils.registerJdbcDriver("com.mysql.jdbc.Driver")
		
	}
	def Connect()
	{
		try{
			def dbURL = 'jdbc:mysql://localhost:3306/soapui'
			def dbUserName = 'root'
			def dbPassword = 'root'
			def dbDriver = 'com.mysql.jdbc.Driver'
			
			context.db = Sql.newInstance(dbURL,dbUserName,dbPassword,dbDriver)
							
			def rows = context.db.rows("SELECT username, password, id, xpath, expected FROM soapui.login_data ORDER BY id")
		    		    
		    log.info('Good: ' + rows.size())
		    context.ite =rows.listIterator()
			def obj = context.ite.getAt(0)
			context.username=obj.get('username')
			context.passw=obj.get('password')
			context.id=obj.get('id')
			context.xpath=obj.get('xpath')
			context.expected=obj.get('expected')
			log.info('username' + context.id + ' : '  +context.username)
			log.info('passw' + context.id + ' : '+context.passw)
			log.info('id'+ context.id + ' : ' +context.id)
		
			
		}catch(Exception e){
			log.info('DB Error')
			log.info(e.getMessage())
		}finally{
		}
	}

}
