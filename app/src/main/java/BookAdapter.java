import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.montjo.johnny.booklist.R;

import org.w3c.dom.Text;

import java.util.List;

public class BookAdapter extends ArrayAdapter<Book> {
    public BookAdapter(Activity context, List<Book> book) {
        super(context, 0, book);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // get book at current position
        Book currentBook = getItem(position);

        // prepare view
        View cardItemView = convertView;
        if (cardItemView == null){
            cardItemView = LayoutInflater.from(getContext()).inflate(R.layout.book_card_view, parent, false);
        }

        // identify and populate views
        TextView titleDis = cardItemView.findViewById(R.id.card_title_text_view);
        titleDis.setText(currentBook.getmBookTitle());

        TextView authorDis = cardItemView.findViewById(R.id.card_author_text_view);
        authorDis.setText(currentBook.getmAuthor());

        TextView yearDis = cardItemView.findViewById(R.id.card_year_text_view);
        yearDis.setText(currentBook.getmPubYear());

        return cardItemView;
    }
}
