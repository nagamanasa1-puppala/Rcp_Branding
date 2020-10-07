package mergeapplication;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;



public class Employee extends ViewPart {
	private TableViewer viewer;

    @Override
    public void createPartControl(Composite parent) {
        Text text = new Text(parent, SWT.BORDER);
        text.setText("This is Customized View");
        GridLayout layout = new GridLayout(2, false);
        parent.setLayout(layout);
        createViewer(parent);
    }
    

    private void createViewer(Composite parent) {
		// TODO Auto-generated method stub
    	viewer = new TableViewer(parent, SWT.MULTI | SWT.FULL_SELECTION | SWT.BORDER);
    	viewer.setContentProvider(ArrayContentProvider.getInstance());
    	TableViewerColumn column = createColumnFor(viewer, "empId");
		column.setLabelProvider(new ColumnLabelProvider() {

			@Override
			public String getText(Object element) {
				return ((EmployeeModel) element).empId;
			}
			
			
		});
		TableViewerColumn column2 = createColumnFor(viewer, "empName");
		column2.setLabelProvider(new ColumnLabelProvider() {

			@Override
			public String getText(Object element) {
				return ((EmployeeModel) element).empName;
			}
		});

		TableViewerColumn column3 = createColumnFor(viewer, "empsal");
		column3.setLabelProvider(new ColumnLabelProvider() {

			@Override
			public String getText(Object element) {
				return ((EmployeeModel) element).empSal;
			}
		});

		TableViewerColumn column4 = createColumnFor(viewer, "gender");

		column4.setLabelProvider(new ColumnLabelProvider() {

			@Override
			public String getText(Object element) {
				return ((EmployeeModel) element).gen;
			}
		});
		viewer.setInput(createModel());
		final Table table = viewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
    	
		
	}


	private static EmployeeModel[] createModel() {
		// TODO Auto-generated method stub
		return new EmployeeModel[] { new EmployeeModel("1", "siva", "20000", "male"), new EmployeeModel("2", "Manasa", "30000", "female"),
				new EmployeeModel("1", "siva", "20000", "male"), new EmployeeModel("2", "Manasa", "30000", "female"),
				new EmployeeModel("2", "Manasa", "30000", "female"), new EmployeeModel("1", "siva", "20000", "male"),
				new EmployeeModel("2", "Manasa", "30000", "female"), new EmployeeModel("2", "Manasa", "30000", "female"),
				new EmployeeModel("2", "Manasa", "30000", "female"), new EmployeeModel("3", "vijaya", "40000", "female") };

	}
	


	private TableViewerColumn createColumnFor(TableViewer viewer, String label) {
		// TODO Auto-generated method stub
		TableViewerColumn column = new TableViewerColumn(viewer, SWT.NONE);
		column.getColumn().setWidth(100);
		column.getColumn().setText(label);
		column.getColumn().setMoveable(true);
		return column;
	}


	@Override
    public void setFocus() {
    }
}
