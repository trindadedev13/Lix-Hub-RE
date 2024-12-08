package dev.trindadedev.lixhubre.ui.screens.home

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.input.nestedscroll.*
import androidx.compose.ui.res.*
import androidx.compose.ui.unit.*
import androidx.compose.ui.text.style.TextAlign
import dev.trindadedev.lixhubre.Strings
import dev.trindadedev.lixhubre.Drawables

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
  val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()
  val scrollState = rememberScrollState()

  Scaffold(
    modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
    topBar = {
      TopAppBar(
        title = {
          Text(
            text = stringResource(id = Strings.app_name),
            textAlign = TextAlign.Center
          )
        },
        scrollBehavior = scrollBehavior
      )
    }
  ) { innerPadding ->
    Column(
      Modifier
        .padding(innerPadding)
        .fillMaxSize()
        .verticalScroll(scrollState)
    ) {
      Column(
        modifier = Modifier
          .fillMaxSize()
          .padding(8.dp)
          .weight(1f),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
      ) {
        Text(
          text = stringResource(id = Strings.login_message),
          fontSize = 40.sp,
          modifier = Modifier.padding(bottom = 50.dp),
          textAlign = TextAlign.Center,
        )
        Button(
          onClick = {
          
          },
          modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 35.dp),
          contentPadding = PaddingValues(0.dp)
        ) {
          Icon(
            painter = painterResource(id = Drawables.ic_google),
            contentDescription = null,
            modifier = Modifier.padding(end = 8.dp)
          )
          Text(
            text = stringResource(id = Strings.common_word_google),
            fontSize = 14.sp
          )
        }
      }
    }
  }
}