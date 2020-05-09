<template>
  <div id="app">
    <Maintenance/>
  </div>
</template>

<script>
import Maintenance from './components/Maintenance.vue'

export default {
  name: 'App',
  components: {
    Maintenance
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #1b1b1b;
  margin-top: 60px;
}
html {
    background-color: #f8c734;
}
</style>
