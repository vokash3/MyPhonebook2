package myPhonebook.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("MyPhonebookService")
public interface MyPhonebookService extends RemoteService {
    // Sample interface method of remote interface
    String getMessage(String msg);

    /**
     * Utility/Convenience class.
     * Use MyPhonebookService.App.getInstance() to access static instance of MyPhonebookServiceAsync
     */
    public static class App {
        private static MyPhonebookServiceAsync ourInstance = GWT.create(MyPhonebookService.class);

        public static synchronized MyPhonebookServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
