import React from 'react'
import "../styles/link.css"

const Link = (props) => {
  return (
    <a class='link' href='#'>{props.value}</a>
  )
}

export default Link