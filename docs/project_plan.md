# Casa di Luca – Project Plan

_This document tracks the design, structure, and feature development for Casa di Luca._

---

## 🧩 A. Current Structure & Status
- All resource files (colors, dimens, strings) have been refactored and standardized.
- Neutral naming convention implemented (`menu_`, `btn_`, `text_`, etc.).
- All layouts connected and functioning correctly.
- Base design is stable and ready for new visual features.
- **Planned expansion:** Multi-activity structure and bilingual support (EN + SV).

---

## 🎨 B. Home View Design (v1)

### Hero Section
- Image: Casa di Luca hero
- Title: CASA DI LUCA
- Subtitle: Authentic Italian flavors made with love
- Info icon (“i”) opens popup

### Info Popup
- Title: About Casa di Luca
- Text: A family-owned restaurant focused on genuine Italian cuisine
- Opening hours and address
- Social icons: Instagram, Facebook
- Close button

### Section 1 – News
- Title: Welcome
- Vertical list of overlay cards:
    - Image
    - Title
    - Short description

### Section 2–3 (Future)
- Horizontal scroll sections (e.g. drinks, desserts)
- Potential “Follow us” or “Find us” section

---

## 🌍 C. Multi-Language Support (EN + SV)
- App text available in both English and Swedish.
- English = base language (`values/strings.xml`)
- Swedish = translation (`values-sv/strings.xml`)
- `locales_config.xml` defines supported locales.
- App automatically switches based on device language.
- (Optional) Add in-app language switch via `AppCompatDelegate`.

---

## 🧭 D. App Structure & Navigation Plan
- **HomeActivity:** main entry point (Home / hero / news)
- **MenuActivity:** dedicated screen for restaurant menu
- **AboutActivity:** future screen for detailed restaurant info
- Use **Intents** for navigation between activities during early development.
- Later: replace with **BottomNavigationView** and Fragments.

---

## 🪄 E. Visual System
- Colors: `neutral_xxx`, `overlay_20`, `text_primary`, etc.
- Typography: `text_xs–xxl`
- Corners: `radius_m`
- Elevation: `elevation_m` for cards and buttons
- Consistent spacing using dimens for padding and margins

---

## 🗺️ F. Future Ideas
- About section (expanded)
- Contact or map section
- Events or specials carousel
- Light/dark theme switch
- Footer with “Find us” and social links
- locales_config.xml support for explicit language listing
- In-app language switch (EN/SV) using AppCompatDelegate
- Refactor XML containers (popup_container, card_container, menu_container)
  into reusable custom view classes for cleaner architecture
- Replace repeated UI blocks with custom components (e.g. CardView, PopupView)
- Move layout logic out of activities to reduce complexity

---

## ✅ G. Next Steps
1. Create `HomeActivity` and layout (`activity_home.xml`)
2. Create `MenuActivity` and connect via Intent
3. Add info popup component for the hero section
4. Add scrollable “News” section
5. Implement bilingual text structure (EN/SV)
6. Integrate social media icons (static links)
7. Begin visual refinement (spacing, shadows, typography)