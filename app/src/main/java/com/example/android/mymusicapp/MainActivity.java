package com.example.android.mymusicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.mymusicapp.AlbumsActivity;
import com.example.android.mymusicapp.ArtistsActivity;
import com.example.android.mymusicapp.FavouritesActivity;
import com.example.android.mymusicapp.FoldersActivity;
import com.example.android.mymusicapp.GenresActivity;
import com.example.android.mymusicapp.NewActivity;
import com.example.android.mymusicapp.R;
import com.example.android.mymusicapp.RecordsActivity;
import com.example.android.mymusicapp.allSongsActivity;
import com.example.android.mymusicapp.lastAddedActivity;
import com.example.android.mymusicapp.mostPlayedActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView allSongs = (TextView) findViewById(R.id.allSongs);

        //Set a clickListener on the View
        allSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new intent to open the {@link allSongsActivity}
                Intent allSongsIntent = new Intent(MainActivity.this,
                        allSongsActivity.class);

                //Start the new activity
                startActivity(allSongsIntent);
            }
        });


        TextView lastadded = (TextView) findViewById(R.id.last_added);

        //Set a clickListener on the View
        lastadded.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new intent to open the {@link lastAddedActivity}
                Intent lastAddedIntent = new Intent(MainActivity.this,
                        lastAddedActivity.class);

                //Start the new activity
                startActivity(lastAddedIntent);
            }
        });


        TextView mostplayed = (TextView) findViewById(R.id.most_played);

        //Set a clickListener on the View
        mostplayed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new intent to open the {@link mostPlayedActivity}
                Intent mostplayedIntent = new Intent(MainActivity.this,
                        mostPlayedActivity.class);

                //Start the new activity
                startActivity(mostplayedIntent);
            }
        });


        TextView favorites = (TextView) findViewById(R.id.favourites);

        //Set a clickListener on the View
        favorites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new intent to open the {@link FavouritesActivity}
                Intent favouritesIntent = new Intent(MainActivity.this,
                        FavouritesActivity.class);

                //Start the new activity
                startActivity(favouritesIntent);
            }
        });


        TextView albums = (TextView) findViewById(R.id.albums);

        //Set a clickListener on the View
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new intent to open the {@link AlbumsActivity}
                Intent albumsIntent = new Intent(MainActivity.this,
                        AlbumsActivity.class);

                //Start the new activity
                startActivity(albumsIntent);
            }
        });


        TextView genres = (TextView) findViewById(R.id.genres);

        //Set a clickListener on the View
        genres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new intent to open the {@link GenresActivity}
                Intent genresIntent = new Intent(MainActivity.this,
                        GenresActivity.class);

                //Start the new activity
                startActivity(genresIntent);
            }
        });


        TextView artists = (TextView) findViewById(R.id.artists);

        //Set a clickListener on the View
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new intent to open the {@link ArtistActivity}
                Intent artistsIntent = new Intent(MainActivity.this,
                        ArtistsActivity.class);

                //Start the new activity
                startActivity(artistsIntent);
            }
        });


        TextView records = (TextView) findViewById(R.id.records);

        //Set a clickListener on the View
        genres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new intent to open the {@link RecordsActivity}
                Intent recordsIntent = new Intent(MainActivity.this,
                        RecordsActivity.class);

                //Start the new activity
                startActivity(recordsIntent);
            }
        });


        TextView folders = (TextView) findViewById(R.id.folders);

        //Set a clickListener on the View
        genres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new intent to open the {@link FoldersActivity}
                Intent foldersIntent = new Intent(MainActivity.this,
                        FoldersActivity.class);

                //Start the new activity
                startActivity(foldersIntent);
            }
        });


        TextView newSongs = (TextView) findViewById(R.id.new_song);

        //Set a clickListener on the View
        newSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new intent to open the {@link Newactivity}
                Intent newIntent = new Intent(MainActivity.this,
                        NewActivity.class);

                //Start the new activity
                startActivity(newIntent);
            }
        });






    }


    public void openAllSongs(View view) {
        Intent i = new Intent(this,
                allSongsActivity.class);
        startActivity(i);
    }


    public void openLastAdded(View view) {
        Intent i = new Intent(this,
                lastAddedActivity.class);
        startActivity(i);
    }

    public void openMostPlayed(View view) {
        Intent i = new Intent(this,
                mostPlayedActivity.class);
        startActivity(i);
    }

    public void openFavourites(View view) {
        Intent i = new Intent(this,
                FavouritesActivity.class);
        startActivity(i);
    }

    public void openAlbums(View view) {
        Intent i = new Intent(this,
                AlbumsActivity.class);
        startActivity(i);
    }

    public void openGenres(View view) {
        Intent i = new Intent(this,
                GenresActivity.class);
        startActivity(i);
    }

    public void openArtists(View view) {
        Intent i = new Intent(this,
                ArtistsActivity.class);
        startActivity(i);
    }

    public void openRecords(View view) {
        Intent i = new Intent(this,
                RecordsActivity.class);
        startActivity(i);
    }

    public void openFolders(View view) {
        Intent i = new Intent(this,
                FoldersActivity.class);
        startActivity(i);
    }

    public void openNew(View view) {
        Intent i = new Intent(this,
                NewActivity.class);
        startActivity(i);
    }

}