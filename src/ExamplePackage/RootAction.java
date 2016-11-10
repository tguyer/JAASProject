package ExamplePackage;
import java.io.File;
import java.io.FilePermission;
import java.security.PrivilegedAction;

import javax.security.auth.Subject;

/* 
 * This class contains an example of an action that we want a subject to execute. 
 * The action involves reading the test2 file. If the subject is a root, then it will be successful, else
 * it will fail. 
 */

public class RootAction {

	
		public void runAsRoot(Subject loggedUser) {
			System.out.println("Running as root.");
		}
}

permission javax.security.auth.AuthPermission "createLoginContext";
permission javax.security.auth.AuthPermission "createLoginContext.JAASExample";
permission javax.security.auth.AuthPermission "modifyPrincipals";
permission javax.security.auth.AuthPermission "getSubject";
};

	
grant {
permission java.io.FilePermission "example/*", "read";
permission java.io.FilePermission "example/test1", "write";
};

ExamplePackage.LoginModuleExample required debug =false; 
};

