# Full-Screen-Mode-in-Jetpack-Compose

for full screen mode in kotlin with jetpack compose you should be do this:
1- Main Activity:

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {

            //your code
        }
    }
  }

  2-
