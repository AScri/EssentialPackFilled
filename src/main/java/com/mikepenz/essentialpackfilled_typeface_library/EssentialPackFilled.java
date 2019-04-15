/*
 * Copyright 2014 Mike Penz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mikepenz.essentialpackfilled_typeface_library;

import android.content.Context;
import android.graphics.Typeface;

import com.mikepenz.iconics.typeface.IIcon;
import com.mikepenz.iconics.typeface.ITypeface;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

public class EssentialPackFilled implements ITypeface {
    private static final String TTF_FILE = "essentialpackfilled-font-v1.0.0.ttf";
    private static Typeface typeface = null;
    private static HashMap<String, Character> mChars;

    @Override
    public IIcon getIcon(String key) {
        return Icon.valueOf(key);
    }

    @Override
    public HashMap<String, Character> getCharacters() {
        if (mChars == null) {
            HashMap<String, Character> aChars = new HashMap<String, Character>();
            for (Icon v : Icon.values()) {
                aChars.put(v.name(), v.character);
            }
            mChars = aChars;
        }
        return mChars;
    }

    @Override
    public String getMappingPrefix() {
        return "esf";
    }

    @Override
    public String getFontName() {
        return "EssentialPackFilled";
    }

    @Override
    public String getVersion() {
        return "1.0.0";
    }

    @Override
    public int getIconCount() {
        return mChars.size();
    }

    @Override
    public Collection<String> getIcons() {
        Collection<String> icons = new LinkedList<String>();
        for (Icon value : Icon.values()) {
            icons.add(value.name());
        }
        return icons;
    }

    @Override
    public String getAuthor() {
        return "https://smashicons.com/";
    }

    @Override
    public String getUrl() {
        return "https://www.flaticon.com/packs/essential-set-2";
    }

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public String getLicense() {
        return "Icon made by https://smashicons.com/ from www.flaticon.com ";
    }

    @Override
    public String getLicenseUrl() {
        return "https://file000.flaticon.com/downloads/license/license.pdf";
    }

    @Override
    public Typeface getTypeface(Context context) {
        if (typeface == null) {
            try {
                typeface = Typeface.createFromAsset(context.getAssets(), "fonts/" + TTF_FILE);
            } catch (Exception e) {
                return null;
            }
        }
        return typeface;
    }

    public enum Icon implements IIcon {
        esf_add_filled('\uf100'),
		esf_add_1_filled('\uf101'),
		esf_add_2_filled('\uf102'),
		esf_add_3_filled('\uf103'),
		esf_agenda_filled('\uf104'),
		esf_alarm_filled('\uf105'),
		esf_alarm_1_filled('\uf106'),
		esf_alarm_clock_filled('\uf107'),
		esf_alarm_clock_1_filled('\uf108'),
		esf_albums_filled('\uf109'),
		esf_app_filled('\uf10a'),
		esf_archive_filled('\uf10b'),
		esf_archive_1_filled('\uf10c'),
		esf_archive_2_filled('\uf10d'),
		esf_archive_3_filled('\uf10e'),
		esf_attachment_filled('\uf10f'),
		esf_back_filled('\uf110'),
		esf_battery_filled('\uf111'),
		esf_battery_1_filled('\uf112'),
		esf_battery_2_filled('\uf113'),
		esf_battery_3_filled('\uf114'),
		esf_battery_4_filled('\uf115'),
		esf_battery_5_filled('\uf116'),
		esf_battery_6_filled('\uf117'),
		esf_battery_7_filled('\uf118'),
		esf_battery_8_filled('\uf119'),
		esf_battery_9_filled('\uf11a'),
		esf_binoculars_filled('\uf11b'),
		esf_blueprint_filled('\uf11c'),
		esf_bluetooth_filled('\uf11d'),
		esf_bluetooth_1_filled('\uf11e'),
		esf_bookmark_filled('\uf11f'),
		esf_bookmark_1_filled('\uf120'),
		esf_briefcase_filled('\uf121'),
		esf_broken_link_filled('\uf122'),
		esf_calculator_filled('\uf123'),
		esf_calculator_1_filled('\uf124'),
		esf_calendar_filled('\uf125'),
		esf_calendar_1_filled('\uf126'),
		esf_calendar_2_filled('\uf127'),
		esf_calendar_3_filled('\uf128'),
		esf_calendar_4_filled('\uf129'),
		esf_calendar_5_filled('\uf12a'),
		esf_calendar_6_filled('\uf12b'),
		esf_calendar_7_filled('\uf12c'),
		esf_checked_filled('\uf12d'),
		esf_checked_1_filled('\uf12e'),
		esf_clock_filled('\uf12f'),
		esf_clock_1_filled('\uf130'),
		esf_close_filled('\uf131'),
		esf_cloud_filled('\uf132'),
		esf_cloud_computing_filled('\uf133'),
		esf_cloud_computing_1_filled('\uf134'),
		esf_cloud_computing_2_filled('\uf135'),
		esf_cloud_computing_3_filled('\uf136'),
		esf_cloud_computing_4_filled('\uf137'),
		esf_cloud_computing_5_filled('\uf138'),
		esf_command_filled('\uf139'),
		esf_compact_disc_filled('\uf13a'),
		esf_compact_disc_1_filled('\uf13b'),
		esf_compact_disc_2_filled('\uf13c'),
		esf_compass_filled('\uf13d'),
		esf_compose_filled('\uf13e'),
		esf_controls_filled('\uf13f'),
		esf_controls_1_filled('\uf140'),
		esf_controls_2_filled('\uf141'),
		esf_controls_3_filled('\uf142'),
		esf_controls_4_filled('\uf143'),
		esf_controls_5_filled('\uf144'),
		esf_controls_6_filled('\uf145'),
		esf_controls_7_filled('\uf146'),
		esf_controls_8_filled('\uf147'),
		esf_controls_9_filled('\uf148'),
		esf_database_filled('\uf149'),
		esf_database_1_filled('\uf14a'),
		esf_database_2_filled('\uf14b'),
		esf_database_3_filled('\uf14c'),
		esf_diamond_filled('\uf14d'),
		esf_diploma_filled('\uf14e'),
		esf_dislike_filled('\uf14f'),
		esf_dislike_1_filled('\uf150'),
		esf_divide_filled('\uf151'),
		esf_divide_1_filled('\uf152'),
		esf_division_filled('\uf153'),
		esf_document_filled('\uf154'),
		esf_download_filled('\uf155'),
		esf_edit_filled('\uf156'),
		esf_edit_1_filled('\uf157'),
		esf_eject_filled('\uf158'),
		esf_eject_1_filled('\uf159'),
		esf_equal_filled('\uf15a'),
		esf_equal_1_filled('\uf15b'),
		esf_equal_2_filled('\uf15c'),
		esf_error_filled('\uf15d'),
		esf_exit_filled('\uf15e'),
		esf_exit_1_filled('\uf15f'),
		esf_exit_2_filled('\uf160'),
		esf_eyeglasses_filled('\uf161'),
		esf_fast_forward_filled('\uf162'),
		esf_fast_forward_1_filled('\uf163'),
		esf_fax_filled('\uf164'),
		esf_file_filled('\uf165'),
		esf_file_1_filled('\uf166'),
		esf_file_2_filled('\uf167'),
		esf_film_filled('\uf168'),
		esf_fingerprint_filled('\uf169'),
		esf_flag_filled('\uf16a'),
		esf_flag_1_filled('\uf16b'),
		esf_flag_2_filled('\uf16c'),
		esf_flag_3_filled('\uf16d'),
		esf_flag_4_filled('\uf16e'),
		esf_focus_filled('\uf16f'),
		esf_folder_filled('\uf170'),
		esf_folder_1_filled('\uf171'),
		esf_folder_10_filled('\uf172'),
		esf_folder_11_filled('\uf173'),
		esf_folder_12_filled('\uf174'),
		esf_folder_13_filled('\uf175'),
		esf_folder_14_filled('\uf176'),
		esf_folder_15_filled('\uf177'),
		esf_folder_16_filled('\uf178'),
		esf_folder_17_filled('\uf179'),
		esf_folder_18_filled('\uf17a'),
		esf_folder_19_filled('\uf17b'),
		esf_folder_2_filled('\uf17c'),
		esf_folder_3_filled('\uf17d'),
		esf_folder_4_filled('\uf17e'),
		esf_folder_5_filled('\uf17f'),
		esf_folder_6_filled('\uf180'),
		esf_folder_7_filled('\uf181'),
		esf_folder_8_filled('\uf182'),
		esf_folder_9_filled('\uf183'),
		esf_forbidden_filled('\uf184'),
		esf_funnel_filled('\uf185'),
		esf_garbage_filled('\uf186'),
		esf_garbage_1_filled('\uf187'),
		esf_garbage_2_filled('\uf188'),
		esf_gift_filled('\uf189'),
		esf_help_filled('\uf18a'),
		esf_hide_filled('\uf18b'),
		esf_hold_filled('\uf18c'),
		esf_home_filled('\uf18d'),
		esf_home_1_filled('\uf18e'),
		esf_home_2_filled('\uf18f'),
		esf_hourglass_filled('\uf190'),
		esf_hourglass_1_filled('\uf191'),
		esf_hourglass_2_filled('\uf192'),
		esf_hourglass_3_filled('\uf193'),
		esf_house_filled('\uf194'),
		esf_id_card_filled('\uf195'),
		esf_id_card_1_filled('\uf196'),
		esf_id_card_2_filled('\uf197'),
		esf_id_card_3_filled('\uf198'),
		esf_id_card_4_filled('\uf199'),
		esf_id_card_5_filled('\uf19a'),
		esf_idea_filled('\uf19b'),
		esf_incoming_filled('\uf19c'),
		esf_infinity_filled('\uf19d'),
		esf_info_filled('\uf19e'),
		esf_internet_filled('\uf19f'),
		esf_key_filled('\uf1a0'),
		esf_lamp_filled('\uf1a1'),
		esf_layers_filled('\uf1a2'),
		esf_layers_1_filled('\uf1a3'),
		esf_like_filled('\uf1a4'),
		esf_like_1_filled('\uf1a5'),
		esf_like_2_filled('\uf1a6'),
		esf_link_filled('\uf1a7'),
		esf_list_filled('\uf1a8'),
		esf_list_1_filled('\uf1a9'),
		esf_lock_filled('\uf1aa'),
		esf_lock_1_filled('\uf1ab'),
		esf_locked_filled('\uf1ac'),
		esf_locked_1_filled('\uf1ad'),
		esf_locked_2_filled('\uf1ae'),
		esf_locked_3_filled('\uf1af'),
		esf_locked_4_filled('\uf1b0'),
		esf_locked_5_filled('\uf1b1'),
		esf_locked_6_filled('\uf1b2'),
		esf_login_filled('\uf1b3'),
		esf_magic_wand_filled('\uf1b4'),
		esf_magnet_filled('\uf1b5'),
		esf_magnet_1_filled('\uf1b6'),
		esf_magnet_2_filled('\uf1b7'),
		esf_map_filled('\uf1b8'),
		esf_map_1_filled('\uf1b9'),
		esf_map_2_filled('\uf1ba'),
		esf_map_location_filled('\uf1bb'),
		esf_megaphone_filled('\uf1bc'),
		esf_megaphone_1_filled('\uf1bd'),
		esf_menu_filled('\uf1be'),
		esf_menu_1_filled('\uf1bf'),
		esf_menu_2_filled('\uf1c0'),
		esf_menu_3_filled('\uf1c1'),
		esf_menu_4_filled('\uf1c2'),
		esf_microphone_filled('\uf1c3'),
		esf_microphone_1_filled('\uf1c4'),
		esf_minus_filled('\uf1c5'),
		esf_minus_1_filled('\uf1c6'),
		esf_more_filled('\uf1c7'),
		esf_more_1_filled('\uf1c8'),
		esf_more_2_filled('\uf1c9'),
		esf_multiply_filled('\uf1ca'),
		esf_multiply_1_filled('\uf1cb'),
		esf_music_player_filled('\uf1cc'),
		esf_music_player_1_filled('\uf1cd'),
		esf_music_player_2_filled('\uf1ce'),
		esf_music_player_3_filled('\uf1cf'),
		esf_mute_filled('\uf1d0'),
		esf_muted_filled('\uf1d1'),
		esf_navigation_filled('\uf1d2'),
		esf_navigation_1_filled('\uf1d3'),
		esf_network_filled('\uf1d4'),
		esf_newspaper_filled('\uf1d5'),
		esf_next_filled('\uf1d6'),
		esf_note_filled('\uf1d7'),
		esf_notebook_filled('\uf1d8'),
		esf_notebook_1_filled('\uf1d9'),
		esf_notebook_2_filled('\uf1da'),
		esf_notebook_3_filled('\uf1db'),
		esf_notebook_4_filled('\uf1dc'),
		esf_notebook_5_filled('\uf1dd'),
		esf_notepad_filled('\uf1de'),
		esf_notepad_1_filled('\uf1df'),
		esf_notepad_2_filled('\uf1e0'),
		esf_notification_filled('\uf1e1'),
		esf_paper_plane_filled('\uf1e2'),
		esf_paper_plane_1_filled('\uf1e3'),
		esf_pause_filled('\uf1e4'),
		esf_pause_1_filled('\uf1e5'),
		esf_percent_filled('\uf1e6'),
		esf_percent_1_filled('\uf1e7'),
		esf_perspective_filled('\uf1e8'),
		esf_photo_camera_filled('\uf1e9'),
		esf_photo_camera_1_filled('\uf1ea'),
		esf_photos_filled('\uf1eb'),
		esf_picture_filled('\uf1ec'),
		esf_picture_1_filled('\uf1ed'),
		esf_picture_2_filled('\uf1ee'),
		esf_pin_filled('\uf1ef'),
		esf_placeholder_filled('\uf1f0'),
		esf_placeholder_1_filled('\uf1f1'),
		esf_placeholder_2_filled('\uf1f2'),
		esf_placeholder_3_filled('\uf1f3'),
		esf_placeholders_filled('\uf1f4'),
		esf_play_button_filled('\uf1f5'),
		esf_play_button_1_filled('\uf1f6'),
		esf_plus_filled('\uf1f7'),
		esf_power_filled('\uf1f8'),
		esf_previous_filled('\uf1f9'),
		esf_price_tag_filled('\uf1fa'),
		esf_print_filled('\uf1fb'),
		esf_push_pin_filled('\uf1fc'),
		esf_radar_filled('\uf1fd'),
		esf_reading_filled('\uf1fe'),
		esf_record_filled('\uf1ff'),
		esf_repeat_filled('\uf200'),
		esf_repeat_1_filled('\uf201'),
		esf_restart_filled('\uf202'),
		esf_resume_filled('\uf203'),
		esf_rewind_filled('\uf204'),
		esf_rewind_1_filled('\uf205'),
		esf_route_filled('\uf206'),
		esf_save_filled('\uf207'),
		esf_search_filled('\uf208'),
		esf_search_1_filled('\uf209'),
		esf_send_filled('\uf20a'),
		esf_server_filled('\uf20b'),
		esf_server_1_filled('\uf20c'),
		esf_server_2_filled('\uf20d'),
		esf_server_3_filled('\uf20e'),
		esf_settings_filled('\uf20f'),
		esf_settings_1_filled('\uf210'),
		esf_settings_2_filled('\uf211'),
		esf_settings_3_filled('\uf212'),
		esf_settings_4_filled('\uf213'),
		esf_settings_5_filled('\uf214'),
		esf_settings_6_filled('\uf215'),
		esf_settings_7_filled('\uf216'),
		esf_settings_8_filled('\uf217'),
		esf_settings_9_filled('\uf218'),
		esf_share_filled('\uf219'),
		esf_share_1_filled('\uf21a'),
		esf_share_2_filled('\uf21b'),
		esf_shuffle_filled('\uf21c'),
		esf_shuffle_1_filled('\uf21d'),
		esf_shutdown_filled('\uf21e'),
		esf_sign_filled('\uf21f'),
		esf_sign_1_filled('\uf220'),
		esf_skip_filled('\uf221'),
		esf_smartphone_filled('\uf222'),
		esf_smartphone_1_filled('\uf223'),
		esf_smartphone_10_filled('\uf224'),
		esf_smartphone_11_filled('\uf225'),
		esf_smartphone_2_filled('\uf226'),
		esf_smartphone_3_filled('\uf227'),
		esf_smartphone_4_filled('\uf228'),
		esf_smartphone_5_filled('\uf229'),
		esf_smartphone_6_filled('\uf22a'),
		esf_smartphone_7_filled('\uf22b'),
		esf_smartphone_8_filled('\uf22c'),
		esf_smartphone_9_filled('\uf22d'),
		esf_speaker_filled('\uf22e'),
		esf_speaker_1_filled('\uf22f'),
		esf_speaker_2_filled('\uf230'),
		esf_speaker_3_filled('\uf231'),
		esf_speaker_4_filled('\uf232'),
		esf_speaker_5_filled('\uf233'),
		esf_speaker_6_filled('\uf234'),
		esf_speaker_7_filled('\uf235'),
		esf_speaker_8_filled('\uf236'),
		esf_spotlight_filled('\uf237'),
		esf_star_filled('\uf238'),
		esf_star_1_filled('\uf239'),
		esf_stop_filled('\uf23a'),
		esf_stop_1_filled('\uf23b'),
		esf_stopwatch_filled('\uf23c'),
		esf_stopwatch_1_filled('\uf23d'),
		esf_stopwatch_2_filled('\uf23e'),
		esf_stopwatch_3_filled('\uf23f'),
		esf_stopwatch_4_filled('\uf240'),
		esf_street_filled('\uf241'),
		esf_street_1_filled('\uf242'),
		esf_substract_filled('\uf243'),
		esf_substract_1_filled('\uf244'),
		esf_success_filled('\uf245'),
		esf_switch_filled('\uf246'),
		esf_switch_1_filled('\uf247'),
		esf_switch_2_filled('\uf248'),
		esf_switch_3_filled('\uf249'),
		esf_switch_4_filled('\uf24a'),
		esf_switch_5_filled('\uf24b'),
		esf_switch_6_filled('\uf24c'),
		esf_switch_7_filled('\uf24d'),
		esf_tabs_filled('\uf24e'),
		esf_tabs_1_filled('\uf24f'),
		esf_target_filled('\uf250'),
		esf_television_filled('\uf251'),
		esf_television_1_filled('\uf252'),
		esf_time_filled('\uf253'),
		esf_trash_filled('\uf254'),
		esf_umbrella_filled('\uf255'),
		esf_unlink_filled('\uf256'),
		esf_unlocked_filled('\uf257'),
		esf_unlocked_1_filled('\uf258'),
		esf_unlocked_2_filled('\uf259'),
		esf_upload_filled('\uf25a'),
		esf_user_filled('\uf25b'),
		esf_user_1_filled('\uf25c'),
		esf_user_2_filled('\uf25d'),
		esf_user_3_filled('\uf25e'),
		esf_user_4_filled('\uf25f'),
		esf_user_5_filled('\uf260'),
		esf_user_6_filled('\uf261'),
		esf_user_7_filled('\uf262'),
		esf_users_filled('\uf263'),
		esf_users_1_filled('\uf264'),
		esf_video_camera_filled('\uf265'),
		esf_video_camera_1_filled('\uf266'),
		esf_video_player_filled('\uf267'),
		esf_video_player_1_filled('\uf268'),
		esf_video_player_2_filled('\uf269'),
		esf_view_filled('\uf26a'),
		esf_view_1_filled('\uf26b'),
		esf_view_2_filled('\uf26c'),
		esf_volume_control_filled('\uf26d'),
		esf_volume_control_1_filled('\uf26e'),
		esf_warning_filled('\uf26f'),
		esf_wifi_filled('\uf270'),
		esf_wifi_1_filled('\uf271'),
		esf_windows_filled('\uf272'),
		esf_windows_1_filled('\uf273'),
		esf_windows_2_filled('\uf274'),
		esf_windows_3_filled('\uf275'),
		esf_windows_4_filled('\uf276'),
		esf_wireless_internet_filled('\uf277'),
		esf_worldwide_filled('\uf278'),
		esf_worldwide_1_filled('\uf279'),
		esf_zoom_in_filled('\uf27a'),
		esf_zoom_out_filled('\uf27b');

        char character;

        Icon(char character) {
            this.character = character;
        }

        public String getFormattedName() {
            return "{" + name() + "}";
        }

        public char getCharacter() {
            return character;
        }

        public String getName() {
            return name();
        }

        // remember the typeface so we can use it later
        private static ITypeface typeface;

        public ITypeface getTypeface() {
            if (typeface == null) {
                typeface = new EssentialPackFilled();
            }
            return typeface;
        }
    }
}
