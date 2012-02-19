package wangzx.client;

import java.util.List;

import com.google.gwt.user.client.ui.Widget;

public interface RecordGrid<T> {

	void setRecords(List<T> records);
	
	Widget asWidget();
	
}
