import java.util.List;

public class ViewSelectedItems {
    private List<String> selectedItems;

    public ViewSelectedItems(List<String> selectedItems) {
        this.selectedItems = selectedItems;
    }

    public void displaySelectedItems() {
        System.out.println("Selected Items:");
        for (String item : selectedItems) {
            System.out.println(item);
        }
    }

    public List<String> getSelectedItems() {
        return selectedItems;
    }

    public void setSelectedItems(List<String> selectedItems) {
        this.selectedItems = selectedItems;
    }
}
