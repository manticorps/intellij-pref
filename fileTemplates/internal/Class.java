#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ${NAME} {
    
    // SLF4J Logger
    private static final Logger LOG = LoggerFactory.getLogger(${NAME}.class);
    
}
