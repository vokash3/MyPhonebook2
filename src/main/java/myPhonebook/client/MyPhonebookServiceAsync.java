package myPhonebook.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface MyPhonebookServiceAsync {
    void getMessage(String msg, AsyncCallback<String> async);
}
