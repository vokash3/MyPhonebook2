package myPhonebook.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import myPhonebook.client.MyPhonebookService;

public class MyPhonebookServiceImpl extends RemoteServiceServlet implements MyPhonebookService {
    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}