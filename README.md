# Full-Screen-Mode-in-Jetpack-Compose

for full screen mode in kotlin with jetpack compose you should be do this:

## 1-Main Activity:
step1 : allow to use entire display

```
Class MainActivity : ComponentActivity() {
 
    override fun onCreate(savedInstanceState: Bundle?) {
    
        super.onCreate(savedInstanceState)
        
        WindowCompat.setDecorFitsSystemWindows(window, false)
        
        setContent {
        
            //your code
        }
    }
    
 } 
 ```

## 2-in your theme file -> ``` theme.kt```
step2: change system bars color to Transparent in AppTheme Composable

```
 if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = Color.Transparent.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }
```

## in Main Composable Screen:
find your parent view and set window insets to zero "0"
and then remove extra paddings in child views if exist
###### disable window insets

 ```
  Scaffold(contentWindowInsets = WindowInsets(left = 0.dp,
        top=0.dp, bottom = 0.dp, right = 0.dp),
    ) {paddingValues->

    //your child views padding:

        Box(modifier = Modifier
            .padding(paddingValues)
            ){
            //your code
}
```






