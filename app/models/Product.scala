package models

case class ProductOption(
  name: String
)

case class ProductSpecification(
  name: String,
  value: String
)

case class Product(
  id: Int,
  name: String,
  slug: String,
  icon: String,
  description: String,
  tagline: String,
  features: Seq[String],
  options: Seq[ProductOption],
  specifications: Seq[ProductSpecification]
)
