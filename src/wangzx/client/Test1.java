package wangzx.client;


import java.util.ArrayList;
import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;

// a simple testcase for RecordPanel/RecordGrid
// we can use it without coding the UI
// it is generated using the record's metadata
//
public class Test1 {

	// we can use a UiTemplate to customize the panel
	//	@UiTemplate("some")
	interface BookPanel extends RecordPanel<Book> {
		
	}
	
	// we can use a UiTemplate to customize the grid
	interface BookGrid extends RecordGrid<Book> {
		
	}
	
	public static void main(String[] args) {
		
		Book book = new Book();
		List<Book> books = new ArrayList<Book>();
		
		BookPanel panel = GWT.create(BookPanel.class);
		panel.setRecord(book);
		
		BookGrid grid = GWT.create(BookGrid.class);
		grid.setRecords(books);

		RootPanel.get("form").add(panel.asWidget());
		RootPanel.get("grid").add(grid.asWidget());
	}
	
}
