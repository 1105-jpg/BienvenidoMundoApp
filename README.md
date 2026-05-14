# 📱 Bienvenido Mundo App

Aplicación Android de bienvenida con soporte multiidioma, multi-pantalla y gráficos nine-patch.

## ✨ Características

- 🌍 **Soporte multiidioma**: Español, Inglés, Francés y Alemán
- 📐 **Multi-pantalla**: Teléfonos, tablets y TV (portrait & landscape)
- 🎨 **Fondo nine-patch**: Imagen redimensionable sin distorsión
- 🤖 **Robot Android**: Ícono vectorial escalable

## 🛠️ Tecnologías


Proyecto Android Multi-language
- Java
- Android SDK (minSdk 21 / targetSdk 34)
- AndroidX + ConstraintLayout
- Gradle 8.2

## 🚀 Instalación

1. Clona el repositorio:
   ```bash
   git clone https://github.com/1105-jpg/BienvenidoMundoApp.git
   ```
2. Abre el proyecto en **Android Studio**
3. Espera la sincronización de Gradle
4. Ejecuta en emulador o dispositivo físico

## 📁 Estructura del proyecto

```
app/src/main/
├── java/com/example/bienvenidoapp/
│   └── MainActivity.java
└── res/
    ├── drawable-nodpi/        # Fondo nine-patch + vector robot
    ├── layout/                # Portrait (teléfono)
    ├── layout-land/           # Landscape (teléfono)
    ├── layout-sw600dp/        # Portrait (tablet)
    ├── layout-sw600dp-land/   # Landscape (tablet)
    ├── values/                # Strings ES (default) + temas + dimens
    ├── values-en/             # Strings EN
    ├── values-fr/             # Strings FR
    └── values-de/             # Strings DE
```

## 🌿 Ramas

| Rama | Propósito |
|------|-----------|
| `main` | Código estable listo para producción |
| `develop` | Desarrollo del día a día |

## 📄 Licencia

Este proyecto está bajo la licencia [MIT](LICENSE).
