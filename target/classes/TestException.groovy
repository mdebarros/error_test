System.out.println("GroovyTestScript::START");
String exceptionMessage = "$exceptionMessage";
String exceptionType = flowVars['exceptionType'];

System.out.println("GroovyTestScript:: exceptionMessage="+exceptionMessage);
System.out.println("GroovyTestScript:: exceptionType="+exceptionType);

switch(exceptionType) {
	case "IOException":
		throw new java.io.IOException(exceptionMessage);
		break;
	case "ValidationException":
		throw new javax.validation.ValidationException();
		break;
	//case "DataMapperExecutionException":
	//	thrown new com.mulesoft.mule.module.datamapper.api.exception.DataMapperExecutionException();
	case "UnknownHostException":
		throw new java.net.UnknownHostException(exceptionMessage)
		break;
	//case "MySQLIntegrityConstraintViolationException":
	//	throw new com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException(exceptionMessage);
	//	break;
	case "Exception":
		throw new java.lang.Exception(exceptionMessage)
		break;
	default:
		break;
}

System.out.println("GroovyTestScript::END");
