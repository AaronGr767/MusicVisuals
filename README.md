# Music Visualiser Project

Name: Aaron Groarke

Student Number: C19373983

# Description of the assignment
The objective of this assignment was to create "something beautiful while listening to music".

My assignment's visuals were based upon my song choice, 'Heat Waves' by Glass Animals. I based the colours of my visuals on the songs message and mood. Keeping with the summer theme of 'Heat Waves', I used predominantly vibrant colours and many different shades of blue as it always reminds me of the beach and summer.

The first visual is an eye with a vibrant spiral for the iris. This image is then joined by 4 bright cubes which alter in unison with the beat. The next visual is 2 rotating cubes with a sphere inside of it. The 4 cubes then return to join the previous 2 rotating cubes. Finally there is a waveform, split into 2 different sides which contrast each other. 

# Instructions
- The user runs the program.
- The user presses the space bar to play the song (If already pressed, the space bar resets the song to its beginning).
- The user uses keys 0-4 to change the program's visual appearance.
- Key 0 - This key is the default if the user doesn't choose a specific number, it renders an eye with a spiral iris.
- Key 1 - Same as key 1 but with the addition of 4 spinning cubes in each corner of the screen.
- Key 2 - 2 rotating cubes with an inner sphere.
- Key 3 - Same as key 2 but with the addition of 4 spinning cubes in each corner of the screen.
- Key 4 - Renders an inverted waveform and normal waveform that mirror each other.

# How it works
This program is comprised of 4 visuals wich have their own classes and which each have seperate instances in the CAVisual class. The CAVisual class is itself an extension of the Visual class.
```Java
public class CAVisual extends Visual{

    centerBox box;
    Eye ed;
    SideBox sbox;
    WaveForm wform;
```

Each of these visual classes contain CAVisual as an instance and a constructor that takes this as a parameter which allows each visual class to use the variables found in CAVisual.
```Java
public class WaveForm {
    
    CAVisual cv;

    public WaveForm(CAVisual cv){
        this.cv = cv;
    }
```

The audio is loaded into the program in the setup() method in the CAVisual class, which also creates objects for each class.
```Java
public void setup()
    {
        ...
        loadAudio("heatwaves.mp3");

        box = new centerBox(this);
        ed = new Eye(this);
        sbox = new SideBox(this);
        wform = new WaveForm(this);
	...
    }
```

The keyPressed() method checks the number of any key from 0-4 and assigns it to the variable userOption which is used in a switch statment to choose which visual to render. Depending on which key is entered, that specific visual is rendered accordingly.
```Java
public void keyPressed(){

        if (key == ' ')
        {
            getAudioPlayer().cue(0);
            getAudioPlayer().play();
        }

        if(keyCode >= '0' && keyCode <= '4' ){
            userOption = keyCode - '0';
        }
    }
```
```Java
switch(userOption){

            case 0: {
                ed.render();
                break;
            }

            case 1: {
                ed.render();
                sbox.render();
                break;
            }

            case 2: {
                box.render();
                break;
            }

            case 3: {
                sbox.render();
                box.render();
                break;
            }
            case 4: {
                wform.render();
                break;
            }
        }
```

# What I am most proud of in the assignment

# Markdown Tutorial

This is *emphasis*

This is a bulleted list

- Item
- Item

This is a numbered list

1. Item
1. Item

This is a [hyperlink](http://bryanduggan.org)

# Headings
## Headings
#### Headings
##### Headings

This is code:

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

So is this without specifying the language:

```
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

This is an image using a relative URL:

![An image](images/p8.png)

This is an image using an absolute URL:

![A different image](https://bryanduggandotorg.files.wordpress.com/2019/02/infinite-forms-00045.png?w=595&h=&zoom=2)

# Youtube Video

[![YouTube]https://youtu.be/ha5Mw7X2_cc

