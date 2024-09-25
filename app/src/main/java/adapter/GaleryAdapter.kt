package adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.mobile.ltihan23september.GaleryActivity
import com.mobile.ltihan23september.R
import model.ModelGalery

data class GaleryAdapter constructor(
    private val getActivity: GaleryActivity,
    private val movieList: List<ModelGalery>
) : RecyclerView.Adapter<GaleryAdapter.MyViewHolder>() {
    class MyViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
        val txtMovie : TextView = itemView.findViewById(R.id.txtMovie)
        val imgMovie : ImageView = itemView.findViewById(R.id.imgMovie)
        val carMovie : CardView = itemView.findViewById(R.id.cardMovie)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView =
            LayoutInflater.from(parent.context).inflate(R.layout.itemgalerycard, parent, false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.txtMovie.text = movieList[position].title
        holder.imgMovie.setImageResource(movieList[position].image)

        holder.carMovie.setOnClickListener(){
            Toast.makeText(getActivity, movieList[position].title, Toast.LENGTH_SHORT).show()
        }
    }
}
