package com.vogella.groovy.first

class Example
	{
	def log
	def context
	def testRunner
	// Class constructor with same case as Class name
	def Example(logIn,contextIn,testRunnerIn)
		{
		this.log = logIn
		this.context = contextIn
		this.testRunner = testRunnerIn
		}
	def Example()
		{
		
		}
	def execute(message)
	{
    		// do some stuff to prove I've run with right context, etc.
    		log.info testRunner
    		log.info context
    		log.info "return "+message
    		return message
	}
	}
