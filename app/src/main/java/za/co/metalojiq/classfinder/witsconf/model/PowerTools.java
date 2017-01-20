package za.co.metalojiq.classfinder.witsconf.model;

import android.text.TextUtils;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import za.co.metalojiq.classfinder.witsconf.R;

/**
 * Created by divine on 1/16/17.
 */

//Java does not care about the order of methods like c++;
//so you should always try to declare then soon after use it so that we the code is easier to read
//// TODO: 1/20/17  make this singular
public class PowerTools {
    private String name;
    private String description;


    private LANGUAGE[] lang;

    public LANGUAGE[] getLang() {
        return lang;
    }

    public String getStringLang() {
        String name = "";
        for (LANGUAGE l : lang) {
            name += l.name().concat(" ");
        }
        return name;
    }

    // TODO lang has many IDEs
    //should use if else
    public static LANGUAGE[] getLanguage(String name) {
        //textUtil is a
        if (TextUtils.equals(names[0], name)) {
            return new LANGUAGE[]{LANGUAGE.CPP, LANGUAGE.OBJECTIVE, LANGUAGE.C, LANGUAGE.SWIFT};
        }
        if (TextUtils.equals(names[1], name)) {
            return new LANGUAGE[]{LANGUAGE.CPP};
        }
        if (TextUtils.equals(names[2], name)) {
            return new LANGUAGE[]{LANGUAGE.C_SHARP};
        }
        if (TextUtils.equals(names[3], name)) {
            return new LANGUAGE[]{LANGUAGE.C_SHARP};
        }
        if (TextUtils.equals(names[4], name)) {
            return new LANGUAGE[]{LANGUAGE.C_SHARP};
        }
        if (TextUtils.equals(names[5], name)) {
            return new LANGUAGE[]{LANGUAGE.C_SHARP};
        }
        if (TextUtils.equals(names[6], name)) { //HUB
            return new LANGUAGE[]{};
        }
        if (TextUtils.equals(names[7], name)) {
            return new LANGUAGE[]{LANGUAGE.JAVA, LANGUAGE.KOTLIN, LANGUAGE.GROOVY, LANGUAGE.SCALA};
        }
        if (TextUtils.equals(names[8], name)) { //kotlin
            return new LANGUAGE[]{LANGUAGE.KOTLIN, LANGUAGE.JAVA};
        }
        if (TextUtils.equals(names[9], name)) { //mps
            return new LANGUAGE[]{LANGUAGE.RUBY};
        }
        if (TextUtils.equals(names[10], name)) {
            return new LANGUAGE[]{LANGUAGE.DSL};
        }
        if (TextUtils.equals(names[11], name)) {
            return new LANGUAGE[]{LANGUAGE.PHP};
        }

        if (TextUtils.equals(names[12], name)) {
            return new LANGUAGE[]{LANGUAGE.PYTHON};
        }
        if (TextUtils.equals(names[13], name)) {
            return new LANGUAGE[]{LANGUAGE.CPP, LANGUAGE.C};
        }
        if (TextUtils.equals(names[14], name)) {
            return new LANGUAGE[]{LANGUAGE.C_SHARP};
        }
        if (TextUtils.equals(names[15], name)) {
            return new LANGUAGE[]{LANGUAGE.C_SHARP};
        }
        if (TextUtils.equals(names[16], name)) { //TEAM CITY
            return new LANGUAGE[]{LANGUAGE.JAVA, LANGUAGE.GROOVY, LANGUAGE.JAVASCRIPT,
                    LANGUAGE.OBJECTIVE, LANGUAGE.RUBY, LANGUAGE.PYTHON, LANGUAGE.PHP, LANGUAGE.C_SHARP};
        }
        if (TextUtils.equals(names[17], name)) { //ToolBox
            return new LANGUAGE[]{};
        }
        if (TextUtils.equals(names[18], name)) { //UP
            return new LANGUAGE[]{LANGUAGE.JAVA, LANGUAGE.JAVASCRIPT, LANGUAGE.KOTLIN};
        }
        if (TextUtils.equals(names[19], name)) { //WEbSt
            return new LANGUAGE[]{LANGUAGE.JAVASCRIPT, LANGUAGE.HTML};
        }
        if (TextUtils.equals(names[20], name)) {  //
            return new LANGUAGE[]{LANGUAGE.CPP, LANGUAGE.OBJECTIVE};
        }
        return new LANGUAGE[]{};
    }


    //show casing enums
    public static enum LANGUAGE {
        JAVA, C_SHARP, CPP, C, GROOVY, JAVASCRIPT, KOTLIN,
        OBJECTIVE, PHP, PYTHON, RUBY, SCALA, SQL, SWIFT, DSL, HTML
    }

    public static List<String> getLangAsArray() {
        ArrayList<String> languages = new ArrayList<>();
        for (LANGUAGE l : LANGUAGE.values()) {
            languages.add(l.name());
        }
        Log.d("AYEYEYEY", "iiiiii " + languages.size());
        return languages;
    }


    public PowerTools(String name, String description, LANGUAGE[] lang) {
        this.name = name;
        this.description = description;
        this.lang = lang;

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


    //TODO add DataGrip
    public static String[] names = {"AppCode", "Clion", "DotCover",
            "dotMemory", "dotPeek", "dotTrace", "Hub",
            "IntelliJ", "KotLin", "RubyMine", "MPS",
            "phpStorm", "pyCharm", "reSharper++", "reSharper",
            "Rider", "TeamCity", "ToolBox", "UpSource", "WebStorm",
            "YouTrack"}; // 21 powertools

    //should have been a 2d Array!!!
    public static String[] desc = {
            "Smart IDE for iOS/macOS development",
            "A smart cross-platform IDE for C and C++",
            ".NET unit test runner and code coverage tool",
            ".NET memory profiler",
            "Free .NET decompiler and assembly browser",
            ".NET performance profiler",
            "JetBrains team tools, integrated: Integrates upsorces, youtrack  and teamCity into one, really nice!!",
            "The most intelligent Java IDE",
            "Statically typed programming language for the JVM, Android and the browser",
            "The most intelligent Ruby IDE",
            "DSL development environment",
            "Lightning-smart PHP IDE",
            "Python IDE for professional developers",
            "Visual Studio extension for C++ developers",
            "Visual Studio extension for .NET developers",
            "A cross-platform .NET IDE based on the IntelliJ platform and ReSharper. So this means you can now do .NET dev on Linux, mac and Windows ",
            "Powerful Continuous Integration out of the box",
            "A control panel for your tools and projects, the best get this first",
            "Code review and repository browsing",
            "The smartest JavaScript IDE",
            "Issue tracker designed for development teams"
    }; //21 descriptions


    // ihad to rename all of therse to lower case imagine i did it manuallly
    public int getImageResource() {
        //better with a switch statement though but for clerence
        if (TextUtils.equals(name, names[0])) {
            return R.drawable.appcode;
        } else if (TextUtils.equals(name, names[1])) {
            return R.drawable.clion;
        } else if (TextUtils.equals(name, names[2])) {
            return R.drawable.dotcover;
        } else if (TextUtils.equals(name, names[3])) {
            return R.drawable.dotmemory;
        } else if (TextUtils.equals(name, names[4])) {
            return R.drawable.dotpeek;
        } else if (TextUtils.equals(name, names[5])) { //dot trace
            return R.drawable.dottrace;
        } else if (TextUtils.equals(name, names[6])) {
            return R.drawable.hub;
        } else if (TextUtils.equals(name, names[7])) {
            return R.drawable.intellij;
        } else if (TextUtils.equals(name, names[8])) {
            return R.drawable.kotlin;
        } else if (TextUtils.equals(name, names[9])) {
            return R.drawable.mine;
        } else if (TextUtils.equals(name, names[10])) {
            return R.drawable.mps;
        } else if (TextUtils.equals(name, names[11])) {
            return R.drawable.phpstorm;
        } else if (TextUtils.equals(name, names[12])) {
            return R.drawable.pycharm;
        } else if (TextUtils.equals(name, names[13])) {
            return R.drawable.resharperpp;
        } else if (TextUtils.equals(name, names[14])) {
            return R.drawable.resharper;
        } else if (TextUtils.equals(name, names[15])) {
            return R.drawable.rider;
        } else if (TextUtils.equals(name, names[16])) {
            return R.drawable.teamcity;
        } else if (TextUtils.equals(name, names[17])) {
            return R.drawable.toolbox;
        } else if (TextUtils.equals(name, names[18])) {
            return R.drawable.upsource;
        } else if (TextUtils.equals(name, names[19])) {
            return R.drawable.webstorm;
        }
        if (TextUtils.equals(name, names[20])) {
            return R.drawable.yt;
        } else {
            return R.drawable.draw9;
        }
    }
}
