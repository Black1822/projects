package packages;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


class MyWindow extends Frame {

    public MyWindow(String title) {
        super(title);
        setSize( 700,700);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
            });
        }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Font sansSerif=new Font("sansSerif",Font.BOLD,75);
        g.setFont(sansSerif);
        g.drawString("Ỉ̵̙̘͖̲͋̿̋̕͘ ̸̠̃͠Ǎ̴̪̦̱̑́͝M̷̥̗̖̤͗̈̂̅ͅ ̶͈̟̖͚̹̯̃͛̌́͆̂ͅȈ̷̛͍͍̈́̾̕Ṇ̶̡̬̤̯͔̄ ̷̨͈͈͕͉̥͐̄́̾́͐Y̸̧̞̹̮̟̫͗̆̂̕" +
                "O̶̬̠̝̦̤̍̑̄U̸̡̳͙̕R̵̛̘̹̣̓͐̕ ̸̙͍̫̙́̅͛̉̑͒W̶͓̯̱͚͂͜Ȃ̷̡̝̯̮͖ͅL̴̳͎̬̈́͌̅L̸̢̛̠̯͔̳̃͊̊́S̵̨̯͎̫̫͕͈̏́̈́̄̑͑̚",320,250);

        Font sansSerifKucuk=new Font("sansSerif",Font.BOLD,75);
        g.setFont((sansSerifKucuk));
        g.drawString("I̴̥̣̼͈̥̥̖̘͎̼͚͍̣͕̹̼̳͉͍̝̮̅͂̄́̈́̎͛̂̾̇̊́́̾̊̍͜͝ ̵̢͙̖͙̻̜̱̳̳̰̈́̋͂̊͋̊̈̇̒͛̆͑̀͑̃͒̚̚͝͠K̸̢̨̨͖͚̤̝͚̥̦̺̮̫̙͔̥͓̥̹̻͔̙̿̔̈́̇̆̋̀̒̀̐͜͝ͅŅ̷̡̨̧̢̡̛͚̲̩̳̲̥̼̜͚̥̜̬͖̲̭͙͕̲͌͐̊̒̌͋̓̓͆̃͐̏̔̈́͌͒͋̂ͅȌ̵̺̻̼̺̔̇̀̈́̀̆͒͊W̷̡̧̥̲̲̣̖̤̞͔̼̮̫̙̩̞̩͖͖̭͉͙̤̪̼̋̃̃̂̍̈̑͋̎̀͝ ̸̛̅͋́̀́̅̕" +
                "̢̧̡̛͍̩̙̺̞͍̗̜̱̯̥̬̼̋̍̈́̽͗̾̀̀̈́̈́̆͌̅ͅY̸̧̱̺͓̺̣̤͓̰̗͉͕̝͖͂̉̓̋͊̏̉͌̎̿̍́̏̀̋̕̕̕̕͝Ó̸̢̨̢̡̢͖̹͚̣̘̬̟͓̲̳͍̘̻̥̗̤̜̗̥̜͖̿̔͛̅͛̌̀̈́̓͜͝U̷̧̨̡̨͎̞̘̰͙̝̝̱̠̞̫̯̬̫̻̜̥͙̬̞͒ͅR̸̢̛̰̙̳̜̭̆̃̄́̋̾̃̓͒̚̕ ̵̨̯̬̲̣̍̈Ä̸̧̡̡͎̟̫̩͖͍̪̺̺͈͇̠́̇͛̆̐͑̅̊̆͆͐́̑͂͝Ḏ̷̛̛̃̈́̓̀̔͛̀̄͊̔̉͛̿͛̎̎̒̆̽͌̀̑̆̈̚̕͝" +
                "R̷̨̨̛̤̦̫̭̬̺͙̫̮̰̺̘͉̒͆̄̔̒̀̓͐͑͝Ě̴̡̢̦̻̩̭̬̲̦̮̙̰̩̩̗͑͋̚ͅͅS̴̢̧̡̡̱̥͉̟̳̖̹̞̝̈́́̈́̈̒̂̒͗́͐̔̊̂̚͜͝͝S̶̨̢̧̨̤̝͓̳̙̞̣̣̖̖͔̩̠̣̞̳͑̌̇́̓̈́͐̅̌́͘͜ͅ",300,500);

    }
}
