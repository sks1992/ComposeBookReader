package sk.sandeep.bookreadercompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import dagger.hilt.android.AndroidEntryPoint
import sk.sandeep.bookreadercompose.ui.theme.BookReaderComposeTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BookReaderComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Text(text = "Greeting")
                }
            }
        }
    }
}

/*
for firebaseDatastore demo

  val db = FirebaseFirestore.getInstance()
                val user: MutableMap<String, Any> = HashMap()

                user["firstName"] = "Sandeep"
                user["lastName"] = "Kumar"

db.collection("users").add(user).addOnSuccessListener {
                        Log.d("FB", "onCreateSuccess: ${it.id}")
                    }.addOnFailureListener {
                        Log.d("FB", "onCreateFailure: $it")
                    }
* */