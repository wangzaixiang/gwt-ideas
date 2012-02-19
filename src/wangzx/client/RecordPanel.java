package wangzx.client;

import com.google.gwt.user.client.ui.Widget;

public interface RecordPanel<T> {

	void setRecord(T record);
	
	Widget asWidget();
	
}
