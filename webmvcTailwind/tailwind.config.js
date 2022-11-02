/** @type {import('tailwindcss').Config} */
module.exports = {
  content: ["./src/main/resources/templates/**/*.{html,js}"],
  theme: {
    extend: {
      container : {
        padding : "16px",
        center : true,
      },
      colors : {
        primary : '#0EA5E9',
      },
      fontFamily: {
        quick: ["Poppins"],
      },
      screens: {
        '2xl': '1320px',
      }
    },
  },
  plugins: [],
}
