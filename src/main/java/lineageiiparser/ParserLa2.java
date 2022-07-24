package lineageiiparser;

import java.io.*;
import java.util.*;

/**
 * @author artem.polschak@gmail.com on 16.07.2022.
 * @project Parser La2
 */
public class ParserLa2 {

    public static void main(String[] args) throws Exception {

        File file = new File("D:\\npc.txt");

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        stringBuilder.append("<!DOCTYPE list SYSTEM \"").append("npc.dtd").append("\">\n");
        stringBuilder.append("<list>\n");

        try (BufferedReader in = new BufferedReader(new FileReader(file))) {

            in.lines().forEach(s -> {

                List<String> list = new ArrayList<>(Arrays.asList(s.split("\\t")));

                list.removeAll(Arrays.asList(null, "\\t"));

                stringBuilder.append("\t<npc id=\"").append(list.get(2)).append("\" name=\"").append(list.get(3)).append("\" title=\"\">\n");
                stringBuilder.append("\t\t<set name=\"collision_height\" value=\"").append(list.get(17).split(";")[1]).append("\"/>\n");
                stringBuilder.append("\t\t<set name=\"collision_radius\" value=\"").append(list.get(16).split(";")[1]).append("\"/>\n");
                stringBuilder.append("\t\t<set name=\"level\" value=\"").append(splitForAppend(list.get(5))).append("\"/>\n");
                stringBuilder.append("\t\t<set name=\"race\" value=\"").append(splitForAppend(list.get(10))).append("\"/>\n");
                stringBuilder.append("\t\t<set name=\"rewardExp\" value=\"").append(splitForAppend(list.get(70))).append("\"/>\n");
                stringBuilder.append("\t\t<set name=\"rewardSp\" value=\"").append(splitForAppend(list.get(71))).append("\"/>\n");
                stringBuilder.append("\t\t<set name=\"baseHpMax\" value=\"").append(splitForAppend(list.get(28))).append("\"/>\n");
                stringBuilder.append("\t\t<set name=\"baseHpRate\" value=\"").append(splitForAppend(list.get(9))).append("\"/>\n");
                stringBuilder.append("\t\t<set name=\"baseHpReg\" value=\"").append(splitForAppend(list.get(29))).append("\"/>\n");
                stringBuilder.append("\t\t<set name=\"baseMpMax\" value=\"").append(splitForAppend(list.get(30))).append("\"/>\n");
                stringBuilder.append("\t\t<set name=\"baseMpReg\" value=\"").append(splitForAppend(list.get(31))).append("\"/>\n");
                stringBuilder.append("\t\t<set name=\"baseSTR\" value=\"").append(splitForAppend(list.get(22))).append("\"/>\n");
                stringBuilder.append("\t\t<set name=\"baseCON\" value=\"").append(splitForAppend(list.get(26))).append("\"/>\n");
                stringBuilder.append("\t\t<set name=\"baseDEX\" value=\"").append(splitForAppend(list.get(24))).append("\"/>\n");
                stringBuilder.append("\t\t<set name=\"baseINT\" value=\"").append(splitForAppend(list.get(23))).append("\"/>\n");
                stringBuilder.append("\t\t<set name=\"baseMEN\" value=\"").append(splitForAppend(list.get(27))).append("\"/>\n");
                stringBuilder.append("\t\t<set name=\"baseWIT\" value=\"").append(splitForAppend(list.get(25))).append("\"/>\n");
                stringBuilder.append("\t\t<set name=\"basePCritRate\" value=\"").append(splitForAppend(list.get(37))).append("\"/>\n");
                stringBuilder.append("\t\t<set name=\"baseMCritRate\" value=\"").append(splitForAppend(list.get(37))).append("\"/>\n");
                stringBuilder.append("\t\t<set name=\"basePAtk\" value=\"").append(splitForAppend(list.get(36))).append("\"/>\n");
                stringBuilder.append("\t\t<set name=\"basePDef\" value=\"").append(splitForAppend(list.get(42))).append("\"/>\n");
                stringBuilder.append("\t\t<set name=\"basePAtkSpd\" value=\"").append(splitForAppend(list.get(39))).append("\"/>\n");
                stringBuilder.append("\t\t<set name=\"baseMAtk\" value=\"").append(splitForAppend(list.get(41))).append("\"/>\n");
                stringBuilder.append("\t\t<set name=\"baseMDef\" value=\"").append(splitForAppend(list.get(43))).append("\"/>\n");
                stringBuilder.append("\t\t<set name=\"baseWalkSpd\" value=\"").append(list.get(21).split(";")[0]).append("\"/>\n");
                stringBuilder.append("\t\t<set name=\"baseRunSpd\" value=\"").append(list.get(20).split(";")[0]).append("\"/>\n");
                stringBuilder.append("\t\t<set name=\"baseShldDef\" value=\"").append(splitForAppend(list.get(48))).append("\"/>\n");
                stringBuilder.append("\t\t<set name=\"baseShldRate\" value=\"").append(splitForAppend(list.get(47))).append("\"/>\n");
                stringBuilder.append("\t\t<set name=\"baseAtkRange\" value=\"").append(splitForAppend(list.get(33))).append("\"/>\n");
                stringBuilder.append("\t\t<set name=\"baseRandDam\" value=\"").append(splitForAppend(list.get(35))).append("\"/>\n");
                stringBuilder.append("\t\t<set name=\"baseAttackType\" value=\"").append(splitForAppend(list.get(32)).toUpperCase()).append("\"/>\n");
                stringBuilder.append("\t\t<set name=\"basePHitModify\" value=\"").append(splitForAppend(list.get(38))).append("\"/>\n");
                stringBuilder.append("\t\t<set name=\"basePAvoidModify\" value=\"").append(splitForAppend(list.get(46))).append("\"/>\n");
                stringBuilder.append("\t\t<set name=\"baseHitTimeFactor\" value=\"").append(splitForAppend(list.get(18))).append("\"/>\n");
                stringBuilder.append("\t\t<set name=\"baseReuseDelay\" value=\"").append(splitForAppend(list.get(40))).append("\"/>\n");
                stringBuilder.append("\t\t<set name=\"baseSafeHeight\" value=\"").append(splitForAppend(list.get(49))).append("\"/>\n");
                stringBuilder.append("\t\t<set name=\"aggroRange\" value=\"").append(splitForAppend(list.get(59))).append("\"/>\n");
                stringBuilder.append("\t\t<set name=\"shots\" value=\"NONE\"/>\n");
                stringBuilder.append("\n\t\t<!-- NOT USE PTS PARAMETERS -->\n");
                stringBuilder.append("\t\t<pts name=\"ai\" value=\"").append(splitForAppend(list.get(66))).append("\"/>\n");
                stringBuilder.append("\t\t<pts name=\"super_type\" value=\"").append(list.get(1)).append("\"/>\n");
                stringBuilder.append("\t\t<pts name=\"elemental_exp\" value=\"").append(splitForAppend(list.get(70))).append("\"/>\n");
                stringBuilder.append("\t\t<pts name=\"ex_crt_effect\" value=\"").append(splitForAppend(list.get(7))).append("\"/>\n");
                stringBuilder.append("\t\t<pts name=\"unique\" value=\"").append(splitForAppend(list.get(8))).append("\"/>\n");
                stringBuilder.append("\t\t<pts name=\"sex\" value=\"").append(splitForAppend(list.get(11))).append("\"/>\n");
                stringBuilder.append("\t\t<pts name=\"slot_chest\" value=\"").append(splitForAppend(list.get(13))).append("\"/>\n");
                stringBuilder.append("\t\t<pts name=\"slot_rhand\" value=\"").append(splitForAppend(list.get(14))).append("\"/>\n");
                stringBuilder.append("\t\t<pts name=\"slot_lhand\" value=\"").append(splitForAppend(list.get(15))).append("\"/>\n");
                stringBuilder.append("\t\t<pts name=\"base_damage_range\" value=\"").append(splitForAppend(list.get(34))).append("\"/>\n");
                stringBuilder.append("\t\t<pts name=\"base_attribute_attack\" value=\"").append(splitForAppend(list.get(44))).append("\"/>\n");
                stringBuilder.append("\t\t<pts name=\"base_attribute_defend\" value=\"").append(splitForAppend(list.get(45))).append("\"/>\n");
                stringBuilder.append("\t\t<pts name=\"soulshot_count\" value=\"").append(splitForAppend(list.get(50))).append("\"/>\n");
                stringBuilder.append("\t\t<pts name=\"spiritshot_count\" value=\"").append(splitForAppend(list.get(51))).append("\"/>\n");
                stringBuilder.append("\t\t<pts name=\"clan\" value=\"").append(splitForAppend(list.get(52))).append("\"/>\n");
                stringBuilder.append("\t\t<pts name=\"ignore_clan_list\" value=\"").append(splitForAppend(list.get(53))).append("\"/>\n");
                stringBuilder.append("\t\t<pts name=\"clan_help_range\" value=\"").append(splitForAppend(list.get(54))).append("\"/>\n");
                stringBuilder.append("\t\t<pts name=\"undying\" value=\"").append(splitForAppend(list.get(55))).append("\"/>\n");
                stringBuilder.append("\t\t<pts name=\"can_be_attacked\" value=\"").append(splitForAppend(list.get(56))).append("\"/>\n");
                stringBuilder.append("\t\t<pts name=\"corpse_time\" value=\"").append(splitForAppend(list.get(57) + "\"/>\n"));
                stringBuilder.append("\t\t<pts name=\"no_sleep_mode\" value=\"").append(splitForAppend(list.get(58))).append("\"/>\n");
                stringBuilder.append("\t\t<pts name=\"agro_range\" value=\"").append(splitForAppend(list.get(59))).append("\"/>\n");
                stringBuilder.append("\t\t<pts name=\"passable_door\" value=\"").append(splitForAppend(list.get(60))).append("\"/>\n");
                stringBuilder.append("\t\t<pts name=\"can_move\" value=\"").append(splitForAppend(list.get(61))).append("\"/>\n");
                stringBuilder.append("\t\t<pts name=\"flying\" value=\"").append(splitForAppend(list.get(62))).append("\"/>\n");
                stringBuilder.append("\t\t<pts name=\"has_summoner\" value=\"").append(splitForAppend(list.get(63))).append("\"/>\n");
                stringBuilder.append("\t\t<pts name=\"targetable\" value=\"").append(splitForAppend(list.get(64))).append("\"/>\n");
                stringBuilder.append("\t\t<pts name=\"show_name_tag\" value=\"").append(splitForAppend(list.get(65))).append("\"/>\n");
                stringBuilder.append("\t\t<pts name=\"event_flag\" value=\"").append(splitForAppend(list.get(67))).append("\"/>\n");
                stringBuilder.append("\t\t<pts name=\"unsowing\" value=\"").append(splitForAppend(list.get(68))).append("\"/>\n");
                stringBuilder.append("\t\t<pts name=\"acquire_rp\" value=\"").append(splitForAppend(list.get(72))).append("\"/>\n");
                stringBuilder.append("\t</npc>\n");
            });
        }

        stringBuilder.append("\n</list>");

        save(stringBuilder, "D:\\0.xml");
    }

    public static void save(StringBuilder str, String file) {
        try (PrintWriter out = new PrintWriter(
                new BufferedOutputStream(
                        new FileOutputStream(file)
                ))) {
            out.println(str);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String splitForAppend(String str) {
        String[] tmp = str.split("=");
        if (tmp.length < 2) {
            return tmp[0];
        } else {
            return tmp[1];
        }
    }
}
