package gg.battler.battleresports;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class TournamentSignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tournament_signup);

        RecyclerView list = findViewById(R.id.recycler_view_project);

        Project[] projects = {
                new Project("Call of Duty Warzone","Mega torneo de Warzone",R.drawable.web_header_mega_warzone),
                new Project("Valorant","Torneo Semanal",R.drawable.web_header_valorant),
                new Project("Efootball PES 2021","Torneo Semanal",R.drawable.web_header_pes),
                new Project("Liga COD","Cuarta edición de la Liga COD",R.drawable.header_cod_mobile),
                new Project("Clash Royale","Torneo semanal",R.drawable.web_header_clash_royale)

        };

        ProjectsAdapter adapter = new ProjectsAdapter(projects);

        list.setAdapter(adapter);
    }
}