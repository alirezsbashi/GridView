package arb.test.grid.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val list = listOf(
        R.drawable.test1 ,
        R.drawable.test2 ,
        R.drawable.test3 ,
        R.drawable.test4 ,
        R.drawable.test5 ,
        R.drawable.test1 ,
        R.drawable.test2 ,
        R.drawable.test3 ,
        R.drawable.test4 ,
        R.drawable.test5 ,
        R.drawable.test1 ,
        R.drawable.test2 ,
        R.drawable.test3 ,
        R.drawable.test4 ,
        R.drawable.test5 ,
        R.drawable.test1 ,
        R.drawable.test2 ,
        R.drawable.test3 ,
        R.drawable.test4 ,
        R.drawable.test5
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridView.adapter = GridAdapter(list)
    }
}
